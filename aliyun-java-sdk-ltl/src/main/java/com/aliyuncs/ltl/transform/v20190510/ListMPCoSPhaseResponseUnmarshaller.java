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

package com.aliyuncs.ltl.transform.v20190510;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ltl.model.v20190510.ListMPCoSPhaseResponse;
import com.aliyuncs.ltl.model.v20190510.ListMPCoSPhaseResponse.Data;
import com.aliyuncs.ltl.model.v20190510.ListMPCoSPhaseResponse.Data.PhaseInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMPCoSPhaseResponseUnmarshaller {

	public static ListMPCoSPhaseResponse unmarshall(ListMPCoSPhaseResponse listMPCoSPhaseResponse, UnmarshallerContext _ctx) {
		
		listMPCoSPhaseResponse.setRequestId(_ctx.stringValue("ListMPCoSPhaseResponse.RequestId"));
		listMPCoSPhaseResponse.setCode(_ctx.integerValue("ListMPCoSPhaseResponse.Code"));
		listMPCoSPhaseResponse.setSuccess(_ctx.booleanValue("ListMPCoSPhaseResponse.Success"));
		listMPCoSPhaseResponse.setMessage(_ctx.stringValue("ListMPCoSPhaseResponse.Message"));

		Data data = new Data();
		data.setTotal(_ctx.integerValue("ListMPCoSPhaseResponse.Data.Total"));
		data.setNum(_ctx.integerValue("ListMPCoSPhaseResponse.Data.Num"));
		data.setSize(_ctx.integerValue("ListMPCoSPhaseResponse.Data.Size"));

		List<PhaseInfo> pageData = new ArrayList<PhaseInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListMPCoSPhaseResponse.Data.PageData.Length"); i++) {
			PhaseInfo phaseInfo = new PhaseInfo();
			phaseInfo.setPhaseId(_ctx.stringValue("ListMPCoSPhaseResponse.Data.PageData["+ i +"].PhaseId"));
			phaseInfo.setName(_ctx.stringValue("ListMPCoSPhaseResponse.Data.PageData["+ i +"].Name"));
			phaseInfo.setRemark(_ctx.stringValue("ListMPCoSPhaseResponse.Data.PageData["+ i +"].Remark"));
			phaseInfo.setAccessPermission(_ctx.integerValue("ListMPCoSPhaseResponse.Data.PageData["+ i +"].AccessPermission"));

			pageData.add(phaseInfo);
		}
		data.setPageData(pageData);
		listMPCoSPhaseResponse.setData(data);
	 
	 	return listMPCoSPhaseResponse;
	}
}