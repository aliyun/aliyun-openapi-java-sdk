/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.facebody.transform.v20191230;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.facebody.model.v20191230.HandPostureResponse;
import com.aliyuncs.facebody.model.v20191230.HandPostureResponse.Data;
import com.aliyuncs.facebody.model.v20191230.HandPostureResponse.Data.MetaObject;
import com.aliyuncs.facebody.model.v20191230.HandPostureResponse.Data.Output;
import com.aliyuncs.facebody.model.v20191230.HandPostureResponse.Data.Output.Result;
import com.aliyuncs.facebody.model.v20191230.HandPostureResponse.Data.Output.Result.Box;
import com.aliyuncs.facebody.model.v20191230.HandPostureResponse.Data.Output.Result.Box.Position;
import com.aliyuncs.facebody.model.v20191230.HandPostureResponse.Data.Output.Result.Hands;
import com.aliyuncs.facebody.model.v20191230.HandPostureResponse.Data.Output.Result.Hands.KeyPoint;
import com.aliyuncs.facebody.model.v20191230.HandPostureResponse.Data.Output.Result.Hands.KeyPoint.Position2;
import com.aliyuncs.transform.UnmarshallerContext;


public class HandPostureResponseUnmarshaller {

	public static HandPostureResponse unmarshall(HandPostureResponse handPostureResponse, UnmarshallerContext _ctx) {
		
		handPostureResponse.setRequestId(_ctx.stringValue("HandPostureResponse.RequestId"));

		Data data = new Data();

		MetaObject metaObject = new MetaObject();
		metaObject.setHeight(_ctx.integerValue("HandPostureResponse.Data.MetaObject.Height"));
		metaObject.setWidth(_ctx.integerValue("HandPostureResponse.Data.MetaObject.Width"));
		data.setMetaObject(metaObject);

		List<Output> outputs = new ArrayList<Output>();
		for (int i = 0; i < _ctx.lengthValue("HandPostureResponse.Data.Outputs.Length"); i++) {
			Output output = new Output();
			output.setHandCount(_ctx.integerValue("HandPostureResponse.Data.Outputs["+ i +"].HandCount"));

			List<Result> results = new ArrayList<Result>();
			for (int j = 0; j < _ctx.lengthValue("HandPostureResponse.Data.Outputs["+ i +"].Results.Length"); j++) {
				Result result = new Result();

				Box box = new Box();
				box.setConfident(_ctx.floatValue("HandPostureResponse.Data.Outputs["+ i +"].Results["+ j +"].Box.Confident"));

				List<Position> positions = new ArrayList<Position>();
				for (int k = 0; k < _ctx.lengthValue("HandPostureResponse.Data.Outputs["+ i +"].Results["+ j +"].Box.Positions.Length"); k++) {
					Position position = new Position();

					List<Float> points = new ArrayList<Float>();
					for (int l = 0; l < _ctx.lengthValue("HandPostureResponse.Data.Outputs["+ i +"].Results["+ j +"].Box.Positions["+ k +"].Points.Length"); l++) {
						points.add(_ctx.floatValue("HandPostureResponse.Data.Outputs["+ i +"].Results["+ j +"].Box.Positions["+ k +"].Points["+ l +"]"));
					}
					position.setPoints(points);

					positions.add(position);
				}
				box.setPositions(positions);
				result.setBox(box);

				Hands hands = new Hands();
				hands.setConfident(_ctx.floatValue("HandPostureResponse.Data.Outputs["+ i +"].Results["+ j +"].Hands.Confident"));

				List<KeyPoint> keyPoints = new ArrayList<KeyPoint>();
				for (int k = 0; k < _ctx.lengthValue("HandPostureResponse.Data.Outputs["+ i +"].Results["+ j +"].Hands.KeyPoints.Length"); k++) {
					KeyPoint keyPoint = new KeyPoint();
					keyPoint.setLabel(_ctx.stringValue("HandPostureResponse.Data.Outputs["+ i +"].Results["+ j +"].Hands.KeyPoints["+ k +"].Label"));

					List<Position2> positions1 = new ArrayList<Position2>();
					for (int l = 0; l < _ctx.lengthValue("HandPostureResponse.Data.Outputs["+ i +"].Results["+ j +"].Hands.KeyPoints["+ k +"].Positions.Length"); l++) {
						Position2 position2 = new Position2();

						List<Float> points3 = new ArrayList<Float>();
						for (int m = 0; m < _ctx.lengthValue("HandPostureResponse.Data.Outputs["+ i +"].Results["+ j +"].Hands.KeyPoints["+ k +"].Positions["+ l +"].Points.Length"); m++) {
							points3.add(_ctx.floatValue("HandPostureResponse.Data.Outputs["+ i +"].Results["+ j +"].Hands.KeyPoints["+ k +"].Positions["+ l +"].Points["+ m +"]"));
						}
						position2.setPoints3(points3);

						positions1.add(position2);
					}
					keyPoint.setPositions1(positions1);

					keyPoints.add(keyPoint);
				}
				hands.setKeyPoints(keyPoints);
				result.setHands(hands);

				results.add(result);
			}
			output.setResults(results);

			outputs.add(output);
		}
		data.setOutputs(outputs);
		handPostureResponse.setData(data);
	 
	 	return handPostureResponse;
	}
}