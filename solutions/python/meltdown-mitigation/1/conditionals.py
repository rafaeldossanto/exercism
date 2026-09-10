"""Functions to prevent a nuclear meltdown."""

CRITICALITY_EMISSION = 500000


def is_criticality_balanced(temperature, neutrons_emitted):
    return (temperature < 800
            and neutrons_emitted > 500
            and temperature * neutrons_emitted < CRITICALITY_EMISSION)


def reactor_efficiency(voltage, current, theoretical_max_power):
    generated_power = voltage * current
    percentage = (generated_power / theoretical_max_power) * 100

    if percentage >= 80:
        return "green"
    elif percentage >= 60:
        return "orange"
    elif percentage >= 30:
        return "red"
    else:
        return "black"


def fail_safe(temperature, neutrons_produced_per_second, threshold):
    value = temperature * neutrons_produced_per_second

    if value < 0.9 * threshold:
        return "LOW"
    elif value <= 1.1 * threshold:
        return "NORMAL"
    else:
        return "DANGER"