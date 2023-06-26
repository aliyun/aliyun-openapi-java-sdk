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

package com.aliyuncs.ebs.transform.v20210730;

import com.aliyuncs.ebs.model.v20210730.DescribeLensServiceStatusResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLensServiceStatusResponseUnmarshaller {

	public static DescribeLensServiceStatusResponse unmarshall(DescribeLensServiceStatusResponse describeLensServiceStatusResponse, UnmarshallerContext _ctx) {
		
		describeLensServiceStatusResponse.setRequestId(_ctx.stringValue("DescribeLensServiceStatusResponse.RequestId"));
		describeLensServiceStatusResponse.setStatus(_ctx.stringValue("DescribeLensServiceStatusResponse.Status"));
	 
	 	return describeLensServiceStatusResponse;
	}
}