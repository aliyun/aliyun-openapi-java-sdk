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

import com.aliyuncs.facebody.model.v20191230.SwapFacialFeaturesResponse;
import com.aliyuncs.facebody.model.v20191230.SwapFacialFeaturesResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class SwapFacialFeaturesResponseUnmarshaller {

	public static SwapFacialFeaturesResponse unmarshall(SwapFacialFeaturesResponse swapFacialFeaturesResponse, UnmarshallerContext _ctx) {
		
		swapFacialFeaturesResponse.setRequestId(_ctx.stringValue("SwapFacialFeaturesResponse.RequestId"));

		Data data = new Data();
		data.setImageURL(_ctx.stringValue("SwapFacialFeaturesResponse.Data.ImageURL"));
		swapFacialFeaturesResponse.setData(data);
	 
	 	return swapFacialFeaturesResponse;
	}
}