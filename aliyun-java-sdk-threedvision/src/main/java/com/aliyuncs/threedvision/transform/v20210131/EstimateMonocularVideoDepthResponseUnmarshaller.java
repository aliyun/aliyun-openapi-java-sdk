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

import com.aliyuncs.threedvision.model.v20210131.EstimateMonocularVideoDepthResponse;
import com.aliyuncs.threedvision.model.v20210131.EstimateMonocularVideoDepthResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class EstimateMonocularVideoDepthResponseUnmarshaller {

	public static EstimateMonocularVideoDepthResponse unmarshall(EstimateMonocularVideoDepthResponse estimateMonocularVideoDepthResponse, UnmarshallerContext _ctx) {
		
		estimateMonocularVideoDepthResponse.setRequestId(_ctx.stringValue("EstimateMonocularVideoDepthResponse.RequestId"));
		estimateMonocularVideoDepthResponse.setCode(_ctx.stringValue("EstimateMonocularVideoDepthResponse.Code"));
		estimateMonocularVideoDepthResponse.setMessage(_ctx.stringValue("EstimateMonocularVideoDepthResponse.Message"));

		Data data = new Data();
		data.setDepthUrl(_ctx.stringValue("EstimateMonocularVideoDepthResponse.Data.DepthUrl"));
		data.setDepthVisUrl(_ctx.stringValue("EstimateMonocularVideoDepthResponse.Data.DepthVisUrl"));
		estimateMonocularVideoDepthResponse.setData(data);
	 
	 	return estimateMonocularVideoDepthResponse;
	}
}