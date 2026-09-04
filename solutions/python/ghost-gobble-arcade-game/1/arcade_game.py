"""Functions for implementing the rules of the classic arcade game Pac-Man."""


def eat_ghost(power_pellet_active, touching_ghost):
    if power_pellet_active and touching_ghost: return True

    return False


def score(touching_power_pellet, touching_dot):
    if touching_power_pellet or touching_dot: return True

    return False

def lose(power_pellet_active, touching_ghost):
    if not power_pellet_active and touching_ghost: return True

    return False


def win(has_eaten_all_dots, power_pellet_active, touching_ghost):
    if has_eaten_all_dots and not lose(power_pellet_active, touching_ghost): return True

    return False

