"""Functions for creating, transforming, and adding prefixes to strings."""


def add_prefix_un(word):
    return "un" + word


def make_word_groups(vocab_words):
    prefix = vocab_words[0]
    prefixed = [prefix + word for word in vocab_words[1:]]
    return ' :: '.join([prefix] + prefixed)


def remove_suffix_ness(word):
    new_word = word[:-4]

    if new_word.endswith("i"):
        new_word = new_word[:-1] + "y"

    return new_word


def adjective_to_verb(sentence, index):
    split_sentence = sentence.split()
    word = split_sentence[index]

    if word and not word[-1].isalpha():
        word = word[:-1]

    return word + "en"


