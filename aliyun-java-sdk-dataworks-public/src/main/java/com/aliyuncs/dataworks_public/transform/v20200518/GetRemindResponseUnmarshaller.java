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

package com.aliyuncs.dataworks_public.transform.v20200518;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataworks_public.model.v20200518.GetRemindResponse;
import com.aliyuncs.dataworks_public.model.v20200518.GetRemindResponse.Data;
import com.aliyuncs.dataworks_public.model.v20200518.GetRemindResponse.Data.BaselinesItem;
import com.aliyuncs.dataworks_public.model.v20200518.GetRemindResponse.Data.BizProcessesItem;
import com.aliyuncs.dataworks_public.model.v20200518.GetRemindResponse.Data.NodesItem;
import com.aliyuncs.dataworks_public.model.v20200518.GetRemindResponse.Data.ProjectsItem;
import com.aliyuncs.dataworks_public.model.v20200518.GetRemindResponse.Data.RobotsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRemindResponseUnmarshaller {

	public static GetRemindResponse unmarshall(GetRemindResponse getRemindResponse, UnmarshallerContext _ctx) {
		
		getRemindResponse.setRequestId(_ctx.stringValue("GetRemindResponse.RequestId"));
		getRemindResponse.setHttpStatusCode(_ctx.integerValue("GetRemindResponse.HttpStatusCode"));
		getRemindResponse.setErrorMessage(_ctx.stringValue("GetRemindResponse.ErrorMessage"));
		getRemindResponse.setErrorCode(_ctx.stringValue("GetRemindResponse.ErrorCode"));
		getRemindResponse.setSuccess(_ctx.booleanValue("GetRemindResponse.Success"));

		Data data = new Data();
		data.setMaxAlertTimes(_ctx.integerValue("GetRemindResponse.Data.MaxAlertTimes"));
		data.setRemindUnit(_ctx.stringValue("GetRemindResponse.Data.RemindUnit"));
		data.setAlertInterval(_ctx.integerValue("GetRemindResponse.Data.AlertInterval"));
		data.setUseflag(_ctx.booleanValue("GetRemindResponse.Data.Useflag"));
		data.setFounder(_ctx.stringValue("GetRemindResponse.Data.Founder"));
		data.setRemindId(_ctx.longValue("GetRemindResponse.Data.RemindId"));
		data.setDndEnd(_ctx.stringValue("GetRemindResponse.Data.DndEnd"));
		data.setRemindType(_ctx.stringValue("GetRemindResponse.Data.RemindType"));
		data.setAlertUnit(_ctx.stringValue("GetRemindResponse.Data.AlertUnit"));
		data.setDndStart(_ctx.stringValue("GetRemindResponse.Data.DndStart"));
		data.setRemindName(_ctx.stringValue("GetRemindResponse.Data.RemindName"));
		data.setDetail(_ctx.stringValue("GetRemindResponse.Data.Detail"));

		List<String> alertTargets = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetRemindResponse.Data.AlertTargets.Length"); i++) {
			alertTargets.add(_ctx.stringValue("GetRemindResponse.Data.AlertTargets["+ i +"]"));
		}
		data.setAlertTargets(alertTargets);

		List<String> alertMethods = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetRemindResponse.Data.AlertMethods.Length"); i++) {
			alertMethods.add(_ctx.stringValue("GetRemindResponse.Data.AlertMethods["+ i +"]"));
		}
		data.setAlertMethods(alertMethods);

		List<RobotsItem> robots = new ArrayList<RobotsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetRemindResponse.Data.Robots.Length"); i++) {
			RobotsItem robotsItem = new RobotsItem();
			robotsItem.setWebUrl(_ctx.stringValue("GetRemindResponse.Data.Robots["+ i +"].WebUrl"));
			robotsItem.setAtAll(_ctx.booleanValue("GetRemindResponse.Data.Robots["+ i +"].AtAll"));

			robots.add(robotsItem);
		}
		data.setRobots(robots);

		List<NodesItem> nodes = new ArrayList<NodesItem>();
		for (int i = 0; i < _ctx.lengthValue("GetRemindResponse.Data.Nodes.Length"); i++) {
			NodesItem nodesItem = new NodesItem();
			nodesItem.setOwner(_ctx.stringValue("GetRemindResponse.Data.Nodes["+ i +"].Owner"));
			nodesItem.setNodeName(_ctx.stringValue("GetRemindResponse.Data.Nodes["+ i +"].NodeName"));
			nodesItem.setNodeId(_ctx.longValue("GetRemindResponse.Data.Nodes["+ i +"].NodeId"));
			nodesItem.setProjectId(_ctx.longValue("GetRemindResponse.Data.Nodes["+ i +"].ProjectId"));

			nodes.add(nodesItem);
		}
		data.setNodes(nodes);

		List<BaselinesItem> baselines = new ArrayList<BaselinesItem>();
		for (int i = 0; i < _ctx.lengthValue("GetRemindResponse.Data.Baselines.Length"); i++) {
			BaselinesItem baselinesItem = new BaselinesItem();
			baselinesItem.setBaselineName(_ctx.stringValue("GetRemindResponse.Data.Baselines["+ i +"].BaselineName"));
			baselinesItem.setBaselineId(_ctx.longValue("GetRemindResponse.Data.Baselines["+ i +"].BaselineId"));

			baselines.add(baselinesItem);
		}
		data.setBaselines(baselines);

		List<ProjectsItem> projects = new ArrayList<ProjectsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetRemindResponse.Data.Projects.Length"); i++) {
			ProjectsItem projectsItem = new ProjectsItem();
			projectsItem.setProjectId(_ctx.longValue("GetRemindResponse.Data.Projects["+ i +"].ProjectId"));

			projects.add(projectsItem);
		}
		data.setProjects(projects);

		List<BizProcessesItem> bizProcesses = new ArrayList<BizProcessesItem>();
		for (int i = 0; i < _ctx.lengthValue("GetRemindResponse.Data.BizProcesses.Length"); i++) {
			BizProcessesItem bizProcessesItem = new BizProcessesItem();
			bizProcessesItem.setBizProcessName(_ctx.stringValue("GetRemindResponse.Data.BizProcesses["+ i +"].BizProcessName"));
			bizProcessesItem.setBizId(_ctx.longValue("GetRemindResponse.Data.BizProcesses["+ i +"].BizId"));

			bizProcesses.add(bizProcessesItem);
		}
		data.setBizProcesses(bizProcesses);
		getRemindResponse.setData(data);
	 
	 	return getRemindResponse;
	}
}