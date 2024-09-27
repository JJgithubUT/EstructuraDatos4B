import unittest
from perfectos import es_perfecto

class TestNumerosPerfectos(unittest.TestCase):
    def test_es_numero_perfecto(self):

        self.assertTrue(es_perfecto(20))

if __name__ == '__main__':
    unittest.main()
