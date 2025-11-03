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

package com.aliyuncs.sophonsoar.transform.v20220728;

import com.aliyuncs.sophonsoar.model.v20220728.ComparePlaybooksResponse;
import com.aliyuncs.sophonsoar.model.v20220728.ComparePlaybooksResponse.CompareResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class ComparePlaybooksResponseUnmarshaller {

	public static ComparePlaybooksResponse unmarshall(ComparePlaybooksResponse comparePlaybooksResponse, UnmarshallerContext _ctx) {
		
		comparePlaybooksResponse.setRequestId(_ctx.stringValue("ComparePlaybooksResponse.RequestId"));

		CompareResult compareResult = new CompareResult();
		compareResult.setSame(_ctx.booleanValue("ComparePlaybooksResponse.CompareResult.Same"));
		compareResult.set_New(_ctx.booleanValue("ComparePlaybooksResponse.CompareResult.New"));
		compareResult.setDescription(_ctx.stringValue("ComparePlaybooksResponse.CompareResult.Description"));
		comparePlaybooksResponse.setCompareResult(compareResult);
	 
	 	return comparePlaybooksResponse;
	}
}