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

package com.aliyuncs.aegis.transform.v20161111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aegis.model.v20161111.DescribeConcernNecessityResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeConcernNecessityResponseUnmarshaller {

	public static DescribeConcernNecessityResponse unmarshall(DescribeConcernNecessityResponse describeConcernNecessityResponse, UnmarshallerContext context) {
		
		describeConcernNecessityResponse.setRequestId(context.stringValue("DescribeConcernNecessityResponse.RequestId"));

		List<String> concernNecessity = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeConcernNecessityResponse.ConcernNecessity.Length"); i++) {
			concernNecessity.add(context.stringValue("DescribeConcernNecessityResponse.ConcernNecessity["+ i +"]"));
		}
		describeConcernNecessityResponse.setConcernNecessity(concernNecessity);
	 
	 	return describeConcernNecessityResponse;
	}
}