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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudcallcenter.model.v20170705.Qry400SpecInfoResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.Qry400SpecInfoResponse.Query400SpecInfoDomain;
import com.aliyuncs.transform.UnmarshallerContext;


public class Qry400SpecInfoResponseUnmarshaller {

	public static Qry400SpecInfoResponse unmarshall(Qry400SpecInfoResponse qry400SpecInfoResponse, UnmarshallerContext context) {
		
		qry400SpecInfoResponse.setRequestId(context.stringValue("Qry400SpecInfoResponse.RequestId"));
		qry400SpecInfoResponse.setSuccess(context.booleanValue("Qry400SpecInfoResponse.Success"));
		qry400SpecInfoResponse.setCode(context.stringValue("Qry400SpecInfoResponse.Code"));
		qry400SpecInfoResponse.setMessage(context.stringValue("Qry400SpecInfoResponse.Message"));
		qry400SpecInfoResponse.setHttpStatusCode(context.integerValue("Qry400SpecInfoResponse.HttpStatusCode"));

		List<Query400SpecInfoDomain> data = new ArrayList<Query400SpecInfoDomain>();
		for (int i = 0; i < context.lengthValue("Qry400SpecInfoResponse.Data.Length"); i++) {
			Query400SpecInfoDomain query400SpecInfoDomain = new Query400SpecInfoDomain();
			query400SpecInfoDomain.setName(context.stringValue("Qry400SpecInfoResponse.Data["+ i +"].Name"));
			query400SpecInfoDomain.setSpecId(context.stringValue("Qry400SpecInfoResponse.Data["+ i +"].SpecId"));

			data.add(query400SpecInfoDomain);
		}
		qry400SpecInfoResponse.setData(data);
	 
	 	return qry400SpecInfoResponse;
	}
}