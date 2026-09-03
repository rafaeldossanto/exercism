"""Functions used in preparing Guido's gorgeous lasagna.

Learn about Guido, the creator of the Python language:
https://en.wikipedia.org/wiki/Guido_van_Rossum

This is a module docstring, used to describe the functionality
of a module and its functions and/or classes.
"""


#TODO (student): define your EXPECTED_BAKE_TIME (required) and PREPARATION_TIME (optional) constants below.
EXPECTED_BAKE_TIME = 40

#TODO (student): Remove 'pass' and complete the 'bake_time_remaining()' function below.
def elapsed_time_in_minutes(number_of_layers, elapsed_bake_time):
    """Calculate the elapsed cooking time.

    :param number_of_layers: int - the number of layers in the lasagna.
    :param elapsed_bake_time: int - the time already spent baking in minutes.
    :return: int - total time elapsed (preparation + already-baked time) in minutes.
    """
    return preparation_time_in_minutes(number_of_layers) + elapsed_bake_time


def bake_time_remaining(number):
    """Calculate the bake time remaining.

    :param number: int - the amount of time already baked, in minutes.
    :return: int - the time remaining to bake, in minutes.
    """
    return EXPECTED_BAKE_TIME - number


def preparation_time_in_minutes(number_of_layers):
    """Calculate the preparation time.

    :param number_of_layers: int - the number of layers in the lasagna.
    :return: int - the preparation time, in minutes.
    """
    return number_of_layers * 2

# TODO (student): Remember to go back and add docstrings to all your functions
#  (you can copy and then alter the one from bake_time_remaining.)
