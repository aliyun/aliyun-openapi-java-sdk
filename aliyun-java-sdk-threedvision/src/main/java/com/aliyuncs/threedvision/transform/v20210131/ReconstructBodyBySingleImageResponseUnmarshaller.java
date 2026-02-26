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

package com.aliyuncs.threedvision.transform.v20210131;

import com.aliyuncs.threedvision.model.v20210131.ReconstructBodyBySingleImageResponse;
import com.aliyuncs.threedvision.model.v20210131.ReconstructBodyBySingleImageResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ReconstructBodyBySingleImageResponseUnmarshaller {

	public static ReconstructBodyBySingleImageResponse unmarshall(ReconstructBodyBySingleImageResponse reconstructBodyBySingleImageResponse, UnmarshallerContext _ctx) {
		
		reconstructBodyBySingleImageResponse.setRequestId(_ctx.stringValue("ReconstructBodyBySingleImageResponse.RequestId"));
		reconstructBodyBySingleImageResponse.setCode(_ctx.stringValue("ReconstructBodyBySingleImageResponse.Code"));
		reconstructBodyBySingleImageResponse.setMessage(_ctx.stringValue("ReconstructBodyBySingleImageResponse.Message"));

		Data data = new Data();
		data.setDepthURL(_ctx.stringValue("ReconstructBodyBySingleImageResponse.Data.DepthURL"));
		data.setMeshURL(_ctx.stringValue("ReconstructBodyBySingleImageResponse.Data.MeshURL"));
		reconstructBodyBySingleImageResponse.setData(data);
	 
	 	return reconstructBodyBySingleImageResponse;
	}
}