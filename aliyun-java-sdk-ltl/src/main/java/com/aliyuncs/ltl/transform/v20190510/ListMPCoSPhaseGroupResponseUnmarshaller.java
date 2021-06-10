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

import com.aliyuncs.ltl.model.v20190510.ListMPCoSPhaseGroupResponse;
import com.aliyuncs.ltl.model.v20190510.ListMPCoSPhaseGroupResponse.Data;
import com.aliyuncs.ltl.model.v20190510.ListMPCoSPhaseGroupResponse.Data.PhaseGroupInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMPCoSPhaseGroupResponseUnmarshaller {

	public static ListMPCoSPhaseGroupResponse unmarshall(ListMPCoSPhaseGroupResponse listMPCoSPhaseGroupResponse, UnmarshallerContext _ctx) {
		
		listMPCoSPhaseGroupResponse.setRequestId(_ctx.stringValue("ListMPCoSPhaseGroupResponse.RequestId"));
		listMPCoSPhaseGroupResponse.setCode(_ctx.integerValue("ListMPCoSPhaseGroupResponse.Code"));
		listMPCoSPhaseGroupResponse.setSuccess(_ctx.booleanValue("ListMPCoSPhaseGroupResponse.Success"));
		listMPCoSPhaseGroupResponse.setMessage(_ctx.stringValue("ListMPCoSPhaseGroupResponse.Message"));

		Data data = new Data();
		data.setTotal(_ctx.integerValue("ListMPCoSPhaseGroupResponse.Data.Total"));
		data.setNum(_ctx.integerValue("ListMPCoSPhaseGroupResponse.Data.Num"));
		data.setSize(_ctx.integerValue("ListMPCoSPhaseGroupResponse.Data.Size"));

		List<PhaseGroupInfo> pageData = new ArrayList<PhaseGroupInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListMPCoSPhaseGroupResponse.Data.PageData.Length"); i++) {
			PhaseGroupInfo phaseGroupInfo = new PhaseGroupInfo();
			phaseGroupInfo.setPhaseGroupId(_ctx.stringValue("ListMPCoSPhaseGroupResponse.Data.PageData["+ i +"].PhaseGroupId"));
			phaseGroupInfo.setName(_ctx.stringValue("ListMPCoSPhaseGroupResponse.Data.PageData["+ i +"].Name"));
			phaseGroupInfo.setRemark(_ctx.stringValue("ListMPCoSPhaseGroupResponse.Data.PageData["+ i +"].Remark"));

			pageData.add(phaseGroupInfo);
		}
		data.setPageData(pageData);
		listMPCoSPhaseGroupResponse.setData(data);
	 
	 	return listMPCoSPhaseGroupResponse;
	}
}