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

package com.aliyuncs.dms_enterprise.transform.v20181101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dms_enterprise.model.v20181101.ListLhTaskFlowAndScenarioResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.ListLhTaskFlowAndScenarioResponse.Dag;
import com.aliyuncs.dms_enterprise.model.v20181101.ListLhTaskFlowAndScenarioResponse.ScenarioDAGList;
import com.aliyuncs.dms_enterprise.model.v20181101.ListLhTaskFlowAndScenarioResponse.ScenarioDAGList.Dag1;
import com.aliyuncs.dms_enterprise.model.v20181101.ListLhTaskFlowAndScenarioResponse.ScenarioDAGList.Scenario;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLhTaskFlowAndScenarioResponseUnmarshaller {

	public static ListLhTaskFlowAndScenarioResponse unmarshall(ListLhTaskFlowAndScenarioResponse listLhTaskFlowAndScenarioResponse, UnmarshallerContext _ctx) {
		
		listLhTaskFlowAndScenarioResponse.setRequestId(_ctx.stringValue("ListLhTaskFlowAndScenarioResponse.RequestId"));
		listLhTaskFlowAndScenarioResponse.setErrorCode(_ctx.stringValue("ListLhTaskFlowAndScenarioResponse.ErrorCode"));
		listLhTaskFlowAndScenarioResponse.setErrorMessage(_ctx.stringValue("ListLhTaskFlowAndScenarioResponse.ErrorMessage"));
		listLhTaskFlowAndScenarioResponse.setSuccess(_ctx.booleanValue("ListLhTaskFlowAndScenarioResponse.Success"));

		ScenarioDAGList scenarioDAGList = new ScenarioDAGList();

		Scenario scenario = new Scenario();
		scenario.setScenarioName(_ctx.stringValue("ListLhTaskFlowAndScenarioResponse.ScenarioDAGList.Scenario.ScenarioName"));
		scenario.setCreatorId(_ctx.stringValue("ListLhTaskFlowAndScenarioResponse.ScenarioDAGList.Scenario.CreatorId"));
		scenario.setDescription(_ctx.stringValue("ListLhTaskFlowAndScenarioResponse.ScenarioDAGList.Scenario.Description"));
		scenarioDAGList.setScenario(scenario);

		List<Dag1> dagList = new ArrayList<Dag1>();
		for (int i = 0; i < _ctx.lengthValue("ListLhTaskFlowAndScenarioResponse.ScenarioDAGList.DagList.Length"); i++) {
			Dag1 dag1 = new Dag1();
			dag1.setId(_ctx.longValue("ListLhTaskFlowAndScenarioResponse.ScenarioDAGList.DagList["+ i +"].Id"));
			dag1.setCreatorId(_ctx.stringValue("ListLhTaskFlowAndScenarioResponse.ScenarioDAGList.DagList["+ i +"].CreatorId"));
			dag1.setIsDeleted(_ctx.booleanValue("ListLhTaskFlowAndScenarioResponse.ScenarioDAGList.DagList["+ i +"].IsDeleted"));
			dag1.setDemoId(_ctx.stringValue("ListLhTaskFlowAndScenarioResponse.ScenarioDAGList.DagList["+ i +"].DemoId"));
			dag1.setDeployId(_ctx.longValue("ListLhTaskFlowAndScenarioResponse.ScenarioDAGList.DagList["+ i +"].DeployId"));
			dag1.setDataFlowId(_ctx.longValue("ListLhTaskFlowAndScenarioResponse.ScenarioDAGList.DagList["+ i +"].DataFlowId"));
			dag1.setScenarioId(_ctx.longValue("ListLhTaskFlowAndScenarioResponse.ScenarioDAGList.DagList["+ i +"].ScenarioId"));
			dag1.setSpaceId(_ctx.longValue("ListLhTaskFlowAndScenarioResponse.ScenarioDAGList.DagList["+ i +"].SpaceId"));
			dag1.setCreatorNickName(_ctx.stringValue("ListLhTaskFlowAndScenarioResponse.ScenarioDAGList.DagList["+ i +"].CreatorNickName"));
			dag1.setDagOwnerNickName(_ctx.stringValue("ListLhTaskFlowAndScenarioResponse.ScenarioDAGList.DagList["+ i +"].DagOwnerNickName"));
			dag1.setCanEdit(_ctx.booleanValue("ListLhTaskFlowAndScenarioResponse.ScenarioDAGList.DagList["+ i +"].CanEdit"));
			dag1.setStatus(_ctx.integerValue("ListLhTaskFlowAndScenarioResponse.ScenarioDAGList.DagList["+ i +"].Status"));
			dag1.setLatestInstanceStatus(_ctx.integerValue("ListLhTaskFlowAndScenarioResponse.ScenarioDAGList.DagList["+ i +"].LatestInstanceStatus"));
			dag1.setLatestInstanceTime(_ctx.integerValue("ListLhTaskFlowAndScenarioResponse.ScenarioDAGList.DagList["+ i +"].LatestInstanceTime"));

			dagList.add(dag1);
		}
		scenarioDAGList.setDagList(dagList);
		listLhTaskFlowAndScenarioResponse.setScenarioDAGList(scenarioDAGList);

		List<Dag> rawDAGList = new ArrayList<Dag>();
		for (int i = 0; i < _ctx.lengthValue("ListLhTaskFlowAndScenarioResponse.RawDAGList.Length"); i++) {
			Dag dag = new Dag();
			dag.setId(_ctx.longValue("ListLhTaskFlowAndScenarioResponse.RawDAGList["+ i +"].Id"));
			dag.setCreatorId(_ctx.stringValue("ListLhTaskFlowAndScenarioResponse.RawDAGList["+ i +"].CreatorId"));
			dag.setIsDeleted(_ctx.booleanValue("ListLhTaskFlowAndScenarioResponse.RawDAGList["+ i +"].IsDeleted"));
			dag.setDemoId(_ctx.stringValue("ListLhTaskFlowAndScenarioResponse.RawDAGList["+ i +"].DemoId"));
			dag.setDeployId(_ctx.longValue("ListLhTaskFlowAndScenarioResponse.RawDAGList["+ i +"].DeployId"));
			dag.setDataFlowId(_ctx.longValue("ListLhTaskFlowAndScenarioResponse.RawDAGList["+ i +"].DataFlowId"));
			dag.setScenarioId(_ctx.longValue("ListLhTaskFlowAndScenarioResponse.RawDAGList["+ i +"].ScenarioId"));
			dag.setSpaceId(_ctx.longValue("ListLhTaskFlowAndScenarioResponse.RawDAGList["+ i +"].SpaceId"));
			dag.setCreatorNickName(_ctx.stringValue("ListLhTaskFlowAndScenarioResponse.RawDAGList["+ i +"].CreatorNickName"));
			dag.setDagOwnerNickName(_ctx.stringValue("ListLhTaskFlowAndScenarioResponse.RawDAGList["+ i +"].DagOwnerNickName"));
			dag.setCanEdit(_ctx.booleanValue("ListLhTaskFlowAndScenarioResponse.RawDAGList["+ i +"].CanEdit"));
			dag.setStatus(_ctx.integerValue("ListLhTaskFlowAndScenarioResponse.RawDAGList["+ i +"].Status"));
			dag.setLatestInstanceStatus(_ctx.integerValue("ListLhTaskFlowAndScenarioResponse.RawDAGList["+ i +"].LatestInstanceStatus"));
			dag.setLatestInstanceTime(_ctx.integerValue("ListLhTaskFlowAndScenarioResponse.RawDAGList["+ i +"].LatestInstanceTime"));

			rawDAGList.add(dag);
		}
		listLhTaskFlowAndScenarioResponse.setRawDAGList(rawDAGList);
	 
	 	return listLhTaskFlowAndScenarioResponse;
	}
}