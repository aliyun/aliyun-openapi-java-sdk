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

package com.aliyuncs.iovcc.transform.v20180501;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iovcc.model.v20180501.ListSupportFeaturesResponse;
import com.aliyuncs.iovcc.model.v20180501.ListSupportFeaturesResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSupportFeaturesResponseUnmarshaller {

	public static ListSupportFeaturesResponse unmarshall(ListSupportFeaturesResponse listSupportFeaturesResponse, UnmarshallerContext _ctx) {
		
		listSupportFeaturesResponse.setRequestId(_ctx.stringValue("ListSupportFeaturesResponse.RequestId"));

		List<Result> supportFeatures = new ArrayList<Result>();
		for (int i = 0; i < _ctx.lengthValue("ListSupportFeaturesResponse.SupportFeatures.Length"); i++) {
			Result result = new Result();
			result.setName(_ctx.stringValue("ListSupportFeaturesResponse.SupportFeatures["+ i +"].Name"));

			supportFeatures.add(result);
		}
		listSupportFeaturesResponse.setSupportFeatures(supportFeatures);
	 
	 	return listSupportFeaturesResponse;
	}
}