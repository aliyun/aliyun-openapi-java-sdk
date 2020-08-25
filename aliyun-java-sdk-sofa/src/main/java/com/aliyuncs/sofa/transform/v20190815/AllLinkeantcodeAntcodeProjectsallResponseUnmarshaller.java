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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.AllLinkeantcodeAntcodeProjectsallResponse;
import com.aliyuncs.sofa.model.v20190815.AllLinkeantcodeAntcodeProjectsallResponse.ListItem;
import com.aliyuncs.sofa.model.v20190815.AllLinkeantcodeAntcodeProjectsallResponse.StateCountsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class AllLinkeantcodeAntcodeProjectsallResponseUnmarshaller {

	public static AllLinkeantcodeAntcodeProjectsallResponse unmarshall(AllLinkeantcodeAntcodeProjectsallResponse allLinkeantcodeAntcodeProjectsallResponse, UnmarshallerContext _ctx) {
		
		allLinkeantcodeAntcodeProjectsallResponse.setRequestId(_ctx.stringValue("AllLinkeantcodeAntcodeProjectsallResponse.RequestId"));
		allLinkeantcodeAntcodeProjectsallResponse.setResultCode(_ctx.stringValue("AllLinkeantcodeAntcodeProjectsallResponse.ResultCode"));
		allLinkeantcodeAntcodeProjectsallResponse.setResultMessage(_ctx.stringValue("AllLinkeantcodeAntcodeProjectsallResponse.ResultMessage"));
		allLinkeantcodeAntcodeProjectsallResponse.setAmount(_ctx.longValue("AllLinkeantcodeAntcodeProjectsallResponse.Amount"));
		allLinkeantcodeAntcodeProjectsallResponse.setResponsePage(_ctx.stringValue("AllLinkeantcodeAntcodeProjectsallResponse.ResponsePage"));
		allLinkeantcodeAntcodeProjectsallResponse.setResponsePageInfoNextPage(_ctx.stringValue("AllLinkeantcodeAntcodeProjectsallResponse.ResponsePageInfoNextPage"));
		allLinkeantcodeAntcodeProjectsallResponse.setResponsePageInfoPerPage(_ctx.stringValue("AllLinkeantcodeAntcodeProjectsallResponse.ResponsePageInfoPerPage"));
		allLinkeantcodeAntcodeProjectsallResponse.setResponsePageInfoPrevPage(_ctx.stringValue("AllLinkeantcodeAntcodeProjectsallResponse.ResponsePageInfoPrevPage"));
		allLinkeantcodeAntcodeProjectsallResponse.setResponsePageInfoTotal(_ctx.stringValue("AllLinkeantcodeAntcodeProjectsallResponse.ResponsePageInfoTotal"));
		allLinkeantcodeAntcodeProjectsallResponse.setResponsePageInfoTotalPages(_ctx.stringValue("AllLinkeantcodeAntcodeProjectsallResponse.ResponsePageInfoTotalPages"));
		allLinkeantcodeAntcodeProjectsallResponse.setResponseStatusCode(_ctx.longValue("AllLinkeantcodeAntcodeProjectsallResponse.ResponseStatusCode"));
		allLinkeantcodeAntcodeProjectsallResponse.setTotal(_ctx.longValue("AllLinkeantcodeAntcodeProjectsallResponse.Total"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("AllLinkeantcodeAntcodeProjectsallResponse.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setDescription(_ctx.stringValue("AllLinkeantcodeAntcodeProjectsallResponse.List["+ i +"].Description"));
			listItem.setHttpUrlToRepo(_ctx.stringValue("AllLinkeantcodeAntcodeProjectsallResponse.List["+ i +"].HttpUrlToRepo"));
			listItem.setId(_ctx.longValue("AllLinkeantcodeAntcodeProjectsallResponse.List["+ i +"].Id"));
			listItem.setLastActivityAt(_ctx.stringValue("AllLinkeantcodeAntcodeProjectsallResponse.List["+ i +"].LastActivityAt"));
			listItem.setName(_ctx.stringValue("AllLinkeantcodeAntcodeProjectsallResponse.List["+ i +"].Name"));
			listItem.setNameWithNamespace(_ctx.stringValue("AllLinkeantcodeAntcodeProjectsallResponse.List["+ i +"].NameWithNamespace"));
			listItem.setPath(_ctx.stringValue("AllLinkeantcodeAntcodeProjectsallResponse.List["+ i +"].Path"));
			listItem.setPathWithNamespace(_ctx.stringValue("AllLinkeantcodeAntcodeProjectsallResponse.List["+ i +"].PathWithNamespace"));
			listItem.setRepositorySize(_ctx.stringValue("AllLinkeantcodeAntcodeProjectsallResponse.List["+ i +"].RepositorySize"));
			listItem.setSshUrlToRepo(_ctx.stringValue("AllLinkeantcodeAntcodeProjectsallResponse.List["+ i +"].SshUrlToRepo"));
			listItem.setVisibilityLevel(_ctx.longValue("AllLinkeantcodeAntcodeProjectsallResponse.List["+ i +"].VisibilityLevel"));

			list.add(listItem);
		}
		allLinkeantcodeAntcodeProjectsallResponse.setList(list);

		List<StateCountsItem> stateCounts = new ArrayList<StateCountsItem>();
		for (int i = 0; i < _ctx.lengthValue("AllLinkeantcodeAntcodeProjectsallResponse.StateCounts.Length"); i++) {
			StateCountsItem stateCountsItem = new StateCountsItem();
			stateCountsItem.setCount(_ctx.longValue("AllLinkeantcodeAntcodeProjectsallResponse.StateCounts["+ i +"].Count"));
			stateCountsItem.setState(_ctx.stringValue("AllLinkeantcodeAntcodeProjectsallResponse.StateCounts["+ i +"].State"));

			stateCounts.add(stateCountsItem);
		}
		allLinkeantcodeAntcodeProjectsallResponse.setStateCounts(stateCounts);
	 
	 	return allLinkeantcodeAntcodeProjectsallResponse;
	}
}