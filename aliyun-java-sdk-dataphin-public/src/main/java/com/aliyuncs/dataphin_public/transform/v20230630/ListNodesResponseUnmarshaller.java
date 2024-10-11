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

package com.aliyuncs.dataphin_public.transform.v20230630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataphin_public.model.v20230630.ListNodesResponse;
import com.aliyuncs.dataphin_public.model.v20230630.ListNodesResponse.PageResult;
import com.aliyuncs.dataphin_public.model.v20230630.ListNodesResponse.PageResult.NodeInfo;
import com.aliyuncs.dataphin_public.model.v20230630.ListNodesResponse.PageResult.NodeInfo.Creator;
import com.aliyuncs.dataphin_public.model.v20230630.ListNodesResponse.PageResult.NodeInfo.Modifier;
import com.aliyuncs.dataphin_public.model.v20230630.ListNodesResponse.PageResult.NodeInfo.ProjectInfo;
import com.aliyuncs.dataphin_public.model.v20230630.ListNodesResponse.PageResult.NodeInfo.User;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListNodesResponseUnmarshaller {

	public static ListNodesResponse unmarshall(ListNodesResponse listNodesResponse, UnmarshallerContext _ctx) {
		
		listNodesResponse.setRequestId(_ctx.stringValue("ListNodesResponse.RequestId"));
		listNodesResponse.setSuccess(_ctx.booleanValue("ListNodesResponse.Success"));
		listNodesResponse.setHttpStatusCode(_ctx.integerValue("ListNodesResponse.HttpStatusCode"));
		listNodesResponse.setCode(_ctx.stringValue("ListNodesResponse.Code"));
		listNodesResponse.setMessage(_ctx.stringValue("ListNodesResponse.Message"));

		PageResult pageResult = new PageResult();
		pageResult.setTotalCount(_ctx.integerValue("ListNodesResponse.PageResult.TotalCount"));

		List<NodeInfo> nodeList = new ArrayList<NodeInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListNodesResponse.PageResult.NodeList.Length"); i++) {
			NodeInfo nodeInfo = new NodeInfo();
			nodeInfo.setDescription(_ctx.stringValue("ListNodesResponse.PageResult.NodeList["+ i +"].Description"));
			nodeInfo.setCreateTime(_ctx.stringValue("ListNodesResponse.PageResult.NodeList["+ i +"].CreateTime"));
			nodeInfo.setDryRun(_ctx.booleanValue("ListNodesResponse.PageResult.NodeList["+ i +"].DryRun"));
			nodeInfo.setFrom(_ctx.stringValue("ListNodesResponse.PageResult.NodeList["+ i +"].From"));
			nodeInfo.setSubDetailType(_ctx.stringValue("ListNodesResponse.PageResult.NodeList["+ i +"].SubDetailType"));
			nodeInfo.setName(_ctx.stringValue("ListNodesResponse.PageResult.NodeList["+ i +"].Name"));
			nodeInfo.setHasProd(_ctx.booleanValue("ListNodesResponse.PageResult.NodeList["+ i +"].HasProd"));
			nodeInfo.setType(_ctx.stringValue("ListNodesResponse.PageResult.NodeList["+ i +"].Type"));
			nodeInfo.setHasDev(_ctx.booleanValue("ListNodesResponse.PageResult.NodeList["+ i +"].HasDev"));
			nodeInfo.setSchedulePaused(_ctx.booleanValue("ListNodesResponse.PageResult.NodeList["+ i +"].SchedulePaused"));
			nodeInfo.setLastModifiedTime(_ctx.stringValue("ListNodesResponse.PageResult.NodeList["+ i +"].LastModifiedTime"));
			nodeInfo.setBizUnitName(_ctx.stringValue("ListNodesResponse.PageResult.NodeList["+ i +"].BizUnitName"));
			nodeInfo.setId(_ctx.stringValue("ListNodesResponse.PageResult.NodeList["+ i +"].Id"));
			nodeInfo.setExtendInfo(_ctx.stringValue("ListNodesResponse.PageResult.NodeList["+ i +"].ExtendInfo"));

			List<String> priorityList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListNodesResponse.PageResult.NodeList["+ i +"].PriorityList.Length"); j++) {
				priorityList.add(_ctx.stringValue("ListNodesResponse.PageResult.NodeList["+ i +"].PriorityList["+ j +"]"));
			}
			nodeInfo.setPriorityList(priorityList);

			List<String> schedulePeriodList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListNodesResponse.PageResult.NodeList["+ i +"].SchedulePeriodList.Length"); j++) {
				schedulePeriodList.add(_ctx.stringValue("ListNodesResponse.PageResult.NodeList["+ i +"].SchedulePeriodList["+ j +"]"));
			}
			nodeInfo.setSchedulePeriodList(schedulePeriodList);

			Creator creator = new Creator();
			creator.setId(_ctx.stringValue("ListNodesResponse.PageResult.NodeList["+ i +"].Creator.Id"));
			creator.setName(_ctx.stringValue("ListNodesResponse.PageResult.NodeList["+ i +"].Creator.Name"));
			nodeInfo.setCreator(creator);

			ProjectInfo projectInfo = new ProjectInfo();
			projectInfo.setId(_ctx.stringValue("ListNodesResponse.PageResult.NodeList["+ i +"].ProjectInfo.Id"));
			projectInfo.setName(_ctx.stringValue("ListNodesResponse.PageResult.NodeList["+ i +"].ProjectInfo.Name"));
			nodeInfo.setProjectInfo(projectInfo);

			Modifier modifier = new Modifier();
			modifier.setId(_ctx.stringValue("ListNodesResponse.PageResult.NodeList["+ i +"].Modifier.Id"));
			modifier.setName(_ctx.stringValue("ListNodesResponse.PageResult.NodeList["+ i +"].Modifier.Name"));
			nodeInfo.setModifier(modifier);

			List<User> ownerList = new ArrayList<User>();
			for (int j = 0; j < _ctx.lengthValue("ListNodesResponse.PageResult.NodeList["+ i +"].OwnerList.Length"); j++) {
				User user = new User();
				user.setId(_ctx.stringValue("ListNodesResponse.PageResult.NodeList["+ i +"].OwnerList["+ j +"].Id"));
				user.setName(_ctx.stringValue("ListNodesResponse.PageResult.NodeList["+ i +"].OwnerList["+ j +"].Name"));

				ownerList.add(user);
			}
			nodeInfo.setOwnerList(ownerList);

			nodeList.add(nodeInfo);
		}
		pageResult.setNodeList(nodeList);
		listNodesResponse.setPageResult(pageResult);
	 
	 	return listNodesResponse;
	}
}