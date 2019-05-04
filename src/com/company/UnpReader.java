        package com.company;

        import java.io.BufferedReader;
        import java.io.FileReader;
        import java.io.IOException;
        import java.util.ArrayList;
        import java.util.List;

        public class UnpReader {
            public List fun() throws IOException {

                FileReader read1 = new FileReader("unp.txt");
                BufferedReader br = new BufferedReader(read1);
                String unp1;
                List Unp = new ArrayList<>();
                while ((unp1 = br.readLine()) != null) {
                    Unp.add(unp1);
                }
                return Unp;
            }
        }
