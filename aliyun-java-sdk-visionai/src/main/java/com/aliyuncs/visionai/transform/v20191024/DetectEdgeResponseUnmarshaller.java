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

package com.aliyuncs.visionai.transform.v20191024;

import com.aliyuncs.visionai.model.v20191024.DetectEdgeResponse;
import com.aliyuncs.visionai.model.v20191024.DetectEdgeResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DetectEdgeResponseUnmarshaller {

	public static DetectEdgeResponse unmarshall(DetectEdgeResponse detectEdgeResponse, UnmarshallerContext _ctx) {
		
		detectEdgeResponse.setRequestId(_ctx.stringValue("DetectEdgeResponse.RequestId"));

		Data data = new Data();
		data.setObjHeight(_ctx.stringValue("DetectEdgeResponse.Data.ObjHeight"));
		data.setObjWidth(_ctx.stringValue("DetectEdgeResponse.Data.ObjWidth"));
		data.setImgWidth(_ctx.stringValue("DetectEdgeResponse.Data.ImgWidth"));
		data.setTop(_ctx.stringValue("DetectEdgeResponse.Data.Top"));
		data.setLeft(_ctx.stringValue("DetectEdgeResponse.Data.Left"));
		data.setImgHeight(_ctx.stringValue("DetectEdgeResponse.Data.ImgHeight"));
		detectEdgeResponse.setData(data);
	 
	 	return detectEdgeResponse;
	}
}