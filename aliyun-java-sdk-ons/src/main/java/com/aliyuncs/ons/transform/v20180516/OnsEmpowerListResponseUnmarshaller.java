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

package com.aliyuncs.ons.transform.v20180516;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ons.model.v20180516.OnsEmpowerListResponse;
import com.aliyuncs.ons.model.v20180516.OnsEmpowerListResponse.AuthOwnerInfoDo;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class OnsEmpowerListResponseUnmarshaller {

	public static OnsEmpowerListResponse unmarshall(OnsEmpowerListResponse onsEmpowerListResponse, UnmarshallerContext context) {
		
		onsEmpowerListResponse.setRequestId(context.stringValue("OnsEmpowerListResponse.RequestId"));
		onsEmpowerListResponse.setHelpUrl(context.stringValue("OnsEmpowerListResponse.HelpUrl"));

		List<AuthOwnerInfoDo> data = new ArrayList<AuthOwnerInfoDo>();
		for (int i = 0; i < context.lengthValue("OnsEmpowerListResponse.Data.Length"); i++) {
			AuthOwnerInfoDo authOwnerInfoDo = new AuthOwnerInfoDo();
			authOwnerInfoDo.setTopic(context.stringValue("OnsEmpowerListResponse.Data["+ i +"].Topic"));
			authOwnerInfoDo.setOwner(context.longValue("OnsEmpowerListResponse.Data["+ i +"].Owner"));
			authOwnerInfoDo.setRelation(context.integerValue("OnsEmpowerListResponse.Data["+ i +"].Relation"));

			data.add(authOwnerInfoDo);
		}
		onsEmpowerListResponse.setData(data);
	 
	 	return onsEmpowerListResponse;
	}
}