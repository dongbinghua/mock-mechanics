{:parts {:cpu35176 {:children nil, :color :blue, :pins {:button35174 {:x 110, :trigger true, :value 0}, :chip35173 {:x 330, :trigger false, :value 0}, :chip35177 {:x 410, :trigger false, :value 0}, :probe35182 {:x 220, :trigger false, :value 1}}, :scale [0.3 0.07 0.3], :gates {:gate-and35178 {:type :and, :x 220, :y 100, :tab 0}, :gate-not35184 {:type :not, :x 220, :y 50, :tab 1}, :gate-and35185 {:type :and, :x 220, :y 100, :tab 1}}, :value 0, :functions nil, :type :cpu, :layer 1, :connections {:connection35179 {:points [:button35174 [110 100] :gate-and35178], :tab 0}, :connection35180 {:points [:gate-and35178 [330 100] :chip35173], :tab 0}, :connection35183 {:points [:probe35182 :gate-and35178], :tab 0}, :connection35186 {:points [:button35174 [110 100] :gate-and35185], :tab 1}, :connection35187 {:points [:probe35182 :gate-not35184], :tab 1}, :connection35188 {:points [:gate-not35184 :gate-and35185], :tab 1}, :connection35189 {:points [:gate-and35185 [410 100] :chip35177], :tab 1}}, :tab 1}, :probe35181-copy35192 {:children nil, :color :purple, :pins nil, :scale [0.1 0.1 0.1], :value 1, :functions nil, :type :probe, :layer 1, :connections nil}, :probe35181 {:children nil, :color :purple, :pins nil, :scale [0.1 0.1 0.1], :value 1, :functions nil, :type :probe, :layer 1, :connections nil}, :probe35182 {:children nil, :color :purple, :pins nil, :scale [0.1 0.1 0.1], :value 1, :functions nil, :type :probe, :layer 1, :connections nil}, :block35168 {:children {:track35170 {:position [0.3 0.3 0.35000002], :rotation [1.0 0.0 0.0 90.00000250447816]}, :chip35173 {:position [0.25 0.25 -0.28500003], :rotation [-1.0 0.0 0.0 90.00000250447816]}, :button35174 {:position [-0.25 0.6 0.0], :rotation [0.0 1.0 0.0 0.0]}, :cpu35176 {:position [-0.25 0.25 -0.28500003], :rotation [-1.0 0.0 0.0 90.00000250447816]}, :chip35177 {:position [0.25 -0.25 -0.28500003], :rotation [-1.0 0.0 0.0 90.00000250447816]}, :probe35181 {:position [0.45 0.19999999 0.3], :rotation [1.0 0.0 0.0 90.00000250447816]}}, :color :white, :pins nil, :scale (1.0 1.0 0.5), :value 0, :functions nil, :type :block, :layer 1, :connections nil}, :track35191 {:children nil, :color :red, :pins nil, :scale [0.1 0.1 0.1], :value 0, :functions nil, :type :track, :layer 1, :connections nil}, :probe35182-copy35192 {:children nil, :color :purple, :pins nil, :scale [0.1 0.1 0.1], :value 1, :functions nil, :type :probe, :layer 1, :connections nil}, :ground-part {:type :ground, :color :dark-gray, :scale [12 0.2 12], :children {:block35168 {:position [-2.5 0.6 -1.25], :rotation [0.0 1.0 0.0 0.0]}, :block35190 {:position [-2.5 0.6 0.75], :rotation [0.0 1.0 0.0 0.0]}, :block35168-copy35192 {:position [2.6 0.6 0.75], :rotation [0.0 1.0 0.0 180.00000500895632]}, :block35190-copy35193 {:position [2.6 0.6 -1.25], :rotation [0.0 1.0 0.0 0.0]}}, :pins nil, :connections nil, :functions nil}, :block35190 {:children nil, :color :white, :pins nil, :scale (1.0 1.0 0.5), :value 0, :functions nil, :type :block, :layer 2, :connections nil}, :chip35173 {:children nil, :color :dark-gray, :pins nil, :scale [0.3 0.07 0.3], :value 0, :time 1.0, :functions {:track35170 {:points [[0 0] [1.0 0.15]], :relative false, :final-points [[0 0] [1.0 0.15]]}}, :type :chip, :layer 1, :connections nil, :view {:offset [0.025 0.1], :zoom 0.5}, :final-time 1.0}, :button35174 {:children nil, :color :red, :pins nil, :scale [0.5 0.2 0.5], :value 0, :functions nil, :type :button, :layer 1, :connections nil}, :block35171-copy35192 {:children {:probe35182-copy35192 {:position [-0.85000014 -0.60000014 0.100000024], :rotation [1.0 1.7763568E-15 1.8105847E-8 90.00000250447816]}, :track35191-copy35192 {:position [-1.0000002 0.7500001 0.0], :rotation [0.0 1.0 0.0 0.0]}}, :color [0 145 0], :pins nil, :scale (2.5 1.3 0.1), :value 0, :functions nil, :type :block, :layer 1, :connections nil}, :block35171 {:children {:probe35182 {:position [-0.85000014 -0.6000001 0.100000024], :rotation [1.0 0.0 0.0 90.00000250447816]}, :track35191 {:position [-1.0000002 0.7500001 0.0], :rotation [0.0 1.0 0.0 0.0]}}, :color [0 0 255], :pins nil, :scale (2.5 1.3 0.1), :value 0, :functions nil, :type :block, :layer 1, :connections nil}, :track35191-copy35192 {:children nil, :color :red, :pins nil, :scale [0.1 0.1 0.1], :value 0, :functions nil, :type :track, :layer 1, :connections nil}, :track35170-copy35192 {:children {:block35171-copy35192 {:position [1.0 0.65 0.0], :rotation [0.0 1.0 0.0 0.0]}}, :color :red, :pins nil, :scale [0.1 0.1 0.1], :value 0.0, :functions nil, :type :track, :layer 1, :connections nil}, :track35170 {:children {:block35171 {:position [1.0 0.65 0.0], :rotation [0.0 1.0 0.0 0.0]}}, :color :red, :pins nil, :scale [0.1 0.1 0.1], :value 0.0, :functions nil, :type :track, :layer 1, :connections nil}, :block35168-copy35192 {:children {:track35170-copy35192 {:position [0.3 0.3 0.35000002], :rotation [1.0 0.0 0.0 90.00000250447816]}, :probe35181-copy35192 {:position [0.45 0.19999999 0.3], :rotation [1.0 0.0 0.0 90.00000250447816]}}, :color :white, :pins nil, :scale (1.0 1.0 0.5), :value 0, :functions nil, :type :block, :layer 1, :connections nil}, :chip35177 {:children nil, :color :dark-gray, :pins nil, :scale [0.3 0.07 0.3], :value 0, :time 1, :functions {:track35170 {:points [[0 0.15] [1 0.0]], :relative false, :final-points [[0 0.15] [1 0.0]]}}, :type :chip, :layer 1, :connections nil, :view {:offset [], :zoom 0.5}, :final-time 1}, :block35190-copy35193 {:children nil, :color :white, :pins nil, :scale (1.0 1.0 0.5), :value 0, :functions nil, :type :block, :layer 2, :connections nil}}, :camera {:vector [0 0 1], :distance 49.475545736717706, :x-angle 25.40000000000004, :y-angle -171.39999999999816, :pivot [0.25673253046820577 0.0 -0.4715215239095407], :eye [6.939923829906682 21.221799850463867 -44.662012246565794]}, :visible-layers [1 2]}