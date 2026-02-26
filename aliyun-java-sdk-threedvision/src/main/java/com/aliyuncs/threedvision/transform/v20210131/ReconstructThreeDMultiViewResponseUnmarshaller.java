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

import com.aliyuncs.threedvision.model.v20210131.ReconstructThreeDMultiViewResponse;
import com.aliyuncs.threedvision.model.v20210131.ReconstructThreeDMultiViewResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ReconstructThreeDMultiViewResponseUnmarshaller {

	public static ReconstructThreeDMultiViewResponse unmarshall(ReconstructThreeDMultiViewResponse reconstructThreeDMultiViewResponse, UnmarshallerContext _ctx) {
		
		reconstructThreeDMultiViewResponse.setRequestId(_ctx.stringValue("ReconstructThreeDMultiViewResponse.RequestId"));
		reconstructThreeDMultiViewResponse.setCode(_ctx.stringValue("ReconstructThreeDMultiViewResponse.Code"));
		reconstructThreeDMultiViewResponse.setMessage(_ctx.stringValue("ReconstructThreeDMultiViewResponse.Message"));

		Data data = new Data();
		data.setPointCloudURL(_ctx.stringValue("ReconstructThreeDMultiViewResponse.Data.PointCloudURL"));
		reconstructThreeDMultiViewResponse.setData(data);
	 
	 	return reconstructThreeDMultiViewResponse;
	}
}