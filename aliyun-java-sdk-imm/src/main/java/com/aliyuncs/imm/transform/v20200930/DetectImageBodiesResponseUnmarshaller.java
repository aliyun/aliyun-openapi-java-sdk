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

package com.aliyuncs.imm.transform.v20200930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.imm.model.v20200930.DetectImageBodiesResponse;
import com.aliyuncs.imm.model.v20200930.DetectImageBodiesResponse.BodiesItem;
import com.aliyuncs.imm.model.v20200930.DetectImageBodiesResponse.BodiesItem.Boundary;
import com.aliyuncs.transform.UnmarshallerContext;


public class DetectImageBodiesResponseUnmarshaller {

	public static DetectImageBodiesResponse unmarshall(DetectImageBodiesResponse detectImageBodiesResponse, UnmarshallerContext _ctx) {
		
		detectImageBodiesResponse.setRequestId(_ctx.stringValue("DetectImageBodiesResponse.RequestId"));

		List<BodiesItem> bodies = new ArrayList<BodiesItem>();
		for (int i = 0; i < _ctx.lengthValue("DetectImageBodiesResponse.Bodies.Length"); i++) {
			BodiesItem bodiesItem = new BodiesItem();
			bodiesItem.setConfidence(_ctx.floatValue("DetectImageBodiesResponse.Bodies["+ i +"].Confidence"));

			Boundary boundary = new Boundary();
			boundary.setWidth(_ctx.longValue("DetectImageBodiesResponse.Bodies["+ i +"].Boundary.Width"));
			boundary.setHeight(_ctx.longValue("DetectImageBodiesResponse.Bodies["+ i +"].Boundary.Height"));
			boundary.setLeft(_ctx.longValue("DetectImageBodiesResponse.Bodies["+ i +"].Boundary.Left"));
			boundary.setTop(_ctx.longValue("DetectImageBodiesResponse.Bodies["+ i +"].Boundary.Top"));
			bodiesItem.setBoundary(boundary);

			bodies.add(bodiesItem);
		}
		detectImageBodiesResponse.setBodies(bodies);
	 
	 	return detectImageBodiesResponse;
	}
}