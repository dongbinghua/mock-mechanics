{:parts {:ground-part {:type :ground, :color :dark-gray, :scale [12 0.2 12], :children {:block8992 {:position [-0.25 0.35 0.75], :rotation [0.0 1.0 0.0 0.0]}, :button8994 {:position [0.75 0.2 0.75], :rotation [0.0 1.0 0.0 0.0]}, :track9021 {:position [-1.25 1.1 0.75], :rotation [0.0 1.0 0.0 0.0]}}, :pins nil, :connections nil, :functions nil}, :block8992 {:type :block, :color :white, :value 0, :layer 1, :scale [0.5 0.5 0.5], :children {:speaker8993 {:position [0.0 0.3 0.0], :rotation [0.0 1.0 0.0 0.0]}, :cpu8995 {:position [0.0 0.0 0.2850001], :rotation [1.0 0.0 0.0 90.00000250447816]}, :chip9023 {:position [-0.28500003 0.0 0.0], :rotation [0.57735026 -0.57735026 -0.57735026 240.00000667860846]}}}, :speaker8993 {:type :speaker, :color :pink, :value 0, :layer 1, :scale [0.4 0.1 0.4], :frequency 440, :children nil}, :button8994 {:type :button, :color :red, :value 0, :layer 1, :scale [0.5 0.2 0.5], :children nil}, :cpu8995 {:children nil, :color :blue, :pins {:speaker8993 {:x 250, :trigger false, :value 0}, :chip9023 {:x 350, :trigger false, :value 0}, :button8994 {:x 120, :trigger true, :value 0}}, :scale [0.3 0.07 0.3], :value 0, :type :cpu, :layer 1, :connections {:connection9146 {:points [:button8994 [120 100] [350 100] :chip9023], :tab 0}}, :tab 0}, :track9021 {:type :track, :color :red, :value 1.0, :layer 1, :scale [0.1 1 0.1], :children {:block9022 {:position [0.0 0.25 0.0], :rotation [0.0 1.0 0.0 0.0]}}}, :block9022 {:type :block, :color :white, :value 0, :layer 1, :scale [0.5 0.5 0.5], :children nil}, :chip9023 {:children nil, :color :dark-gray, :scale [0.3 0.07 0.3], :value 0, :time 1, :functions {:track9021 {:points [[0 0] [1 1]], :relative false, :final-points [[0 0] [1 1]]}}, :type :chip, :layer 1, :view {:offset [0.025 0.1], :zoom 0.5}, :final-time 1}}, :camera {:vector [0 0 1], :distance 26.17234339341166, :x-angle 30.200000000000088, :y-angle -41.79999999999967, :pivot [0.18784718583308013 3.552713678800501E-15 0.8547568816158684], :eye [15.26487641404353 13.165210723876957 17.71749644460415]}, :visible-layers [1]}