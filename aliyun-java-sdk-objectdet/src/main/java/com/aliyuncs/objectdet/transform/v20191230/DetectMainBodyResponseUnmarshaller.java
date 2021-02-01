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

package com.aliyuncs.objectdet.transform.v20191230;

import com.aliyuncs.objectdet.model.v20191230.DetectMainBodyResponse;
import com.aliyuncs.objectdet.model.v20191230.DetectMainBodyResponse.Data;
import com.aliyuncs.objectdet.model.v20191230.DetectMainBodyResponse.Data.Location;
import com.aliyuncs.transform.UnmarshallerContext;


public class DetectMainBodyResponseUnmarshaller {

	public static DetectMainBodyResponse unmarshall(DetectMainBodyResponse detectMainBodyResponse, UnmarshallerContext _ctx) {
		
		detectMainBodyResponse.setRequestId(_ctx.stringValue("DetectMainBodyResponse.RequestId"));

		Data data = new Data();

		Location location = new Location();
		location.setX(_ctx.integerValue("DetectMainBodyResponse.Data.Location.X"));
		location.setY(_ctx.integerValue("DetectMainBodyResponse.Data.Location.Y"));
		location.setHeight(_ctx.integerValue("DetectMainBodyResponse.Data.Location.Height"));
		location.setWidth(_ctx.integerValue("DetectMainBodyResponse.Data.Location.Width"));
		data.setLocation(location);
		detectMainBodyResponse.setData(data);
	 
	 	return detectMainBodyResponse;
	}
}