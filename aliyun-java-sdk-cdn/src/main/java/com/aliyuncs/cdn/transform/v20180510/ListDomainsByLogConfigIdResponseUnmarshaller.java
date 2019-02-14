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

package com.aliyuncs.cdn.transform.v20180510;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cdn.model.v20180510.ListDomainsByLogConfigIdResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDomainsByLogConfigIdResponseUnmarshaller {

	public static ListDomainsByLogConfigIdResponse unmarshall(ListDomainsByLogConfigIdResponse listDomainsByLogConfigIdResponse, UnmarshallerContext context) {
		
		listDomainsByLogConfigIdResponse.setRequestId(context.stringValue("ListDomainsByLogConfigIdResponse.RequestId"));

		List<String> domains = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("ListDomainsByLogConfigIdResponse.Domains.Length"); i++) {
			domains.add(context.stringValue("ListDomainsByLogConfigIdResponse.Domains["+ i +"]"));
		}
		listDomainsByLogConfigIdResponse.setDomains(domains);
	 
	 	return listDomainsByLogConfigIdResponse;
	}
}