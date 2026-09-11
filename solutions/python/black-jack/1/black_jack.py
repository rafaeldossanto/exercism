CARDS = ['2', '3', '4', '5', '6', '7', '8', '9', '10', 'J', 'Q', 'K', 'A']


def value_of_card(card):
    if card in ('J', 'Q', 'K'):
        return 10
    if card == 'A':
        return 1
    return int(card)


def _value_with_ace_high(card):
    return 11 if card == 'A' else value_of_card(card)


def higher_card(card_one, card_two):
    value_one = value_of_card(card_one)
    value_two = value_of_card(card_two)

    if value_one == value_two:
        return card_one, card_two
    return card_one if value_one > value_two else card_two


def value_of_ace(card_one, card_two):
    total = _value_with_ace_high(card_one) + _value_with_ace_high(card_two)
    return 11 if total + 11 <= 21 else 1


def is_blackjack(card_one, card_two):
    total = _value_with_ace_high(card_one) + _value_with_ace_high(card_two)
    return total == 21


def can_split_pairs(card_one, card_two):
    return value_of_card(card_one) == value_of_card(card_two)


def can_double_down(card_one, card_two):
    total = value_of_card(card_one) + value_of_card(card_two)
    return 9 <= total <= 11