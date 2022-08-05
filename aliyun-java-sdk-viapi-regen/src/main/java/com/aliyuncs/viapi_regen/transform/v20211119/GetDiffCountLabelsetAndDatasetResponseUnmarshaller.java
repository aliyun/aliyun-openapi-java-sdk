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

package com.aliyuncs.viapi_regen.transform.v20211119;

import com.aliyuncs.viapi_regen.model.v20211119.GetDiffCountLabelsetAndDatasetResponse;
import com.aliyuncs.viapi_regen.model.v20211119.GetDiffCountLabelsetAndDatasetResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDiffCountLabelsetAndDatasetResponseUnmarshaller {

	public static GetDiffCountLabelsetAndDatasetResponse unmarshall(GetDiffCountLabelsetAndDatasetResponse getDiffCountLabelsetAndDatasetResponse, UnmarshallerContext _ctx) {
		
		getDiffCountLabelsetAndDatasetResponse.setRequestId(_ctx.stringValue("GetDiffCountLabelsetAndDatasetResponse.RequestId"));
		getDiffCountLabelsetAndDatasetResponse.setMessage(_ctx.stringValue("GetDiffCountLabelsetAndDatasetResponse.Message"));
		getDiffCountLabelsetAndDatasetResponse.setCode(_ctx.stringValue("GetDiffCountLabelsetAndDatasetResponse.Code"));

		Data data = new Data();
		data.setDiffCount(_ctx.longValue("GetDiffCountLabelsetAndDatasetResponse.Data.DiffCount"));
		getDiffCountLabelsetAndDatasetResponse.setData(data);
	 
	 	return getDiffCountLabelsetAndDatasetResponse;
	}
}