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

package com.aliyuncs.paifeaturestore.transform.v20230621;

import com.aliyuncs.paifeaturestore.model.v20230621.GetProjectFeatureEntityHotIdsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetProjectFeatureEntityHotIdsResponseUnmarshaller {

	public static GetProjectFeatureEntityHotIdsResponse unmarshall(GetProjectFeatureEntityHotIdsResponse getProjectFeatureEntityHotIdsResponse, UnmarshallerContext _ctx) {
		
		getProjectFeatureEntityHotIdsResponse.setRequestId(_ctx.stringValue("GetProjectFeatureEntityHotIdsResponse.RequestId"));
		getProjectFeatureEntityHotIdsResponse.setHotIds(_ctx.stringValue("GetProjectFeatureEntityHotIdsResponse.HotIds"));
		getProjectFeatureEntityHotIdsResponse.setCount(_ctx.integerValue("GetProjectFeatureEntityHotIdsResponse.Count"));
		getProjectFeatureEntityHotIdsResponse.setNextSeqNumber(_ctx.stringValue("GetProjectFeatureEntityHotIdsResponse.NextSeqNumber"));
	 
	 	return getProjectFeatureEntityHotIdsResponse;
	}
}