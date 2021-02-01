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

import com.aliyuncs.facebody.model.v20191230.BodyPostureResponse;
import com.aliyuncs.facebody.model.v20191230.BodyPostureResponse.Data;
import com.aliyuncs.facebody.model.v20191230.BodyPostureResponse.Data.MetaObject;
import com.aliyuncs.facebody.model.v20191230.BodyPostureResponse.Data.Output;
import com.aliyuncs.facebody.model.v20191230.BodyPostureResponse.Data.Output.Result;
import com.aliyuncs.facebody.model.v20191230.BodyPostureResponse.Data.Output.Result.Body;
import com.aliyuncs.facebody.model.v20191230.BodyPostureResponse.Data.Output.Result.Body.Position;
import com.aliyuncs.transform.UnmarshallerContext;


public class BodyPostureResponseUnmarshaller {

	public static BodyPostureResponse unmarshall(BodyPostureResponse bodyPostureResponse, UnmarshallerContext _ctx) {
		
		bodyPostureResponse.setRequestId(_ctx.stringValue("BodyPostureResponse.RequestId"));

		Data data = new Data();

		MetaObject metaObject = new MetaObject();
		metaObject.setHeight(_ctx.integerValue("BodyPostureResponse.Data.MetaObject.Height"));
		metaObject.setWidth(_ctx.integerValue("BodyPostureResponse.Data.MetaObject.Width"));
		data.setMetaObject(metaObject);

		List<Output> outputs = new ArrayList<Output>();
		for (int i = 0; i < _ctx.lengthValue("BodyPostureResponse.Data.Outputs.Length"); i++) {
			Output output = new Output();
			output.setHumanCount(_ctx.integerValue("BodyPostureResponse.Data.Outputs["+ i +"].HumanCount"));

			List<Result> results = new ArrayList<Result>();
			for (int j = 0; j < _ctx.lengthValue("BodyPostureResponse.Data.Outputs["+ i +"].Results.Length"); j++) {
				Result result = new Result();

				List<Body> bodies = new ArrayList<Body>();
				for (int k = 0; k < _ctx.lengthValue("BodyPostureResponse.Data.Outputs["+ i +"].Results["+ j +"].Bodies.Length"); k++) {
					Body body = new Body();
					body.setConfident(_ctx.floatValue("BodyPostureResponse.Data.Outputs["+ i +"].Results["+ j +"].Bodies["+ k +"].Confident"));
					body.setLabel(_ctx.stringValue("BodyPostureResponse.Data.Outputs["+ i +"].Results["+ j +"].Bodies["+ k +"].Label"));

					List<Position> positions = new ArrayList<Position>();
					for (int l = 0; l < _ctx.lengthValue("BodyPostureResponse.Data.Outputs["+ i +"].Results["+ j +"].Bodies["+ k +"].Positions.Length"); l++) {
						Position position = new Position();

						List<Float> points = new ArrayList<Float>();
						for (int m = 0; m < _ctx.lengthValue("BodyPostureResponse.Data.Outputs["+ i +"].Results["+ j +"].Bodies["+ k +"].Positions["+ l +"].Points.Length"); m++) {
							points.add(_ctx.floatValue("BodyPostureResponse.Data.Outputs["+ i +"].Results["+ j +"].Bodies["+ k +"].Positions["+ l +"].Points["+ m +"]"));
						}
						position.setPoints(points);

						positions.add(position);
					}
					body.setPositions(positions);

					bodies.add(body);
				}
				result.setBodies(bodies);

				results.add(result);
			}
			output.setResults(results);

			outputs.add(output);
		}
		data.setOutputs(outputs);
		bodyPostureResponse.setData(data);
	 
	 	return bodyPostureResponse;
	}
}