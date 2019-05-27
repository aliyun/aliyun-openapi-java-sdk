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

package com.aliyuncs.imm.transform.v20170906;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.imm.model.v20170906.DetectImageBodiesResponse;
import com.aliyuncs.imm.model.v20170906.DetectImageBodiesResponse.BodiesItem;
import com.aliyuncs.imm.model.v20170906.DetectImageBodiesResponse.BodiesItem.BodyBoundary;
import com.aliyuncs.transform.UnmarshallerContext;


public class DetectImageBodiesResponseUnmarshaller {

	public static DetectImageBodiesResponse unmarshall(DetectImageBodiesResponse detectImageBodiesResponse, UnmarshallerContext context) {
		
		detectImageBodiesResponse.setRequestId(context.stringValue("DetectImageBodiesResponse.RequestId"));
		detectImageBodiesResponse.setImageUri(context.stringValue("DetectImageBodiesResponse.ImageUri"));

		List<BodiesItem> bodies = new ArrayList<BodiesItem>();
		for (int i = 0; i < context.lengthValue("DetectImageBodiesResponse.Bodies.Length"); i++) {
			BodiesItem bodiesItem = new BodiesItem();
			bodiesItem.setBodyConfidence(context.floatValue("DetectImageBodiesResponse.Bodies["+ i +"].BodyConfidence"));

			BodyBoundary bodyBoundary = new BodyBoundary();
			bodyBoundary.setLeft(context.integerValue("DetectImageBodiesResponse.Bodies["+ i +"].BodyBoundary.Left"));
			bodyBoundary.setTop(context.integerValue("DetectImageBodiesResponse.Bodies["+ i +"].BodyBoundary.Top"));
			bodyBoundary.setWidth(context.integerValue("DetectImageBodiesResponse.Bodies["+ i +"].BodyBoundary.Width"));
			bodyBoundary.setHeight(context.integerValue("DetectImageBodiesResponse.Bodies["+ i +"].BodyBoundary.Height"));
			bodiesItem.setBodyBoundary(bodyBoundary);

			bodies.add(bodiesItem);
		}
		detectImageBodiesResponse.setBodies(bodies);
	 
	 	return detectImageBodiesResponse;
	}
}