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
import com.aliyuncs.dms_enterprise.model.v20181101.ListLhTaskFlowAndScenarioResponse.ScenarioDAG;
import com.aliyuncs.dms_enterprise.model.v20181101.ListLhTaskFlowAndScenarioResponse.ScenarioDAG.Dag1;
import com.aliyuncs.dms_enterprise.model.v20181101.ListLhTaskFlowAndScenarioResponse.ScenarioDAG.Scenario;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLhTaskFlowAndScenarioResponseUnmarshaller {

	public static ListLhTaskFlowAndScenarioResponse unmarshall(ListLhTaskFlowAndScenarioResponse listLhTaskFlowAndScenarioResponse, UnmarshallerContext _ctx) {
		
		listLhTaskFlowAndScenarioResponse.setRequestId(_ctx.stringValue("ListLhTaskFlowAndScenarioResponse.RequestId"));
		listLhTaskFlowAndScenarioResponse.setErrorCode(_ctx.stringValue("ListLhTaskFlowAndScenarioResponse.ErrorCode"));
		listLhTaskFlowAndScenarioResponse.setErrorMessage(_ctx.stringValue("ListLhTaskFlowAndScenarioResponse.ErrorMessage"));
		listLhTaskFlowAndScenarioResponse.setSuccess(_ctx.booleanValue("ListLhTaskFlowAndScenarioResponse.Success"));

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
			dag.setDagName(_ctx.stringValue("ListLhTaskFlowAndScenarioResponse.RawDAGList["+ i +"].DagName"));
			dag.setDagOwnerId(_ctx.stringValue("ListLhTaskFlowAndScenarioResponse.RawDAGList["+ i +"].DagOwnerId"));

			rawDAGList.add(dag);
		}
		listLhTaskFlowAndScenarioResponse.setRawDAGList(rawDAGList);

		List<ScenarioDAG> scenarioDAGList = new ArrayList<ScenarioDAG>();
		for (int i = 0; i < _ctx.lengthValue("ListLhTaskFlowAndScenarioResponse.ScenarioDAGList.Length"); i++) {
			ScenarioDAG scenarioDAG = new ScenarioDAG();

			Scenario scenario = new Scenario();
			scenario.setScenarioName(_ctx.stringValue("ListLhTaskFlowAndScenarioResponse.ScenarioDAGList["+ i +"].Scenario.ScenarioName"));
			scenario.setCreatorId(_ctx.stringValue("ListLhTaskFlowAndScenarioResponse.ScenarioDAGList["+ i +"].Scenario.CreatorId"));
			scenario.setDescription(_ctx.stringValue("ListLhTaskFlowAndScenarioResponse.ScenarioDAGList["+ i +"].Scenario.Description"));
			scenarioDAG.setScenario(scenario);

			List<Dag1> dagList = new ArrayList<Dag1>();
			for (int j = 0; j < _ctx.lengthValue("ListLhTaskFlowAndScenarioResponse.ScenarioDAGList["+ i +"].DagList.Length"); j++) {
				Dag1 dag1 = new Dag1();
				dag1.setId(_ctx.longValue("ListLhTaskFlowAndScenarioResponse.ScenarioDAGList["+ i +"].DagList["+ j +"].Id"));
				dag1.setCreatorId(_ctx.stringValue("ListLhTaskFlowAndScenarioResponse.ScenarioDAGList["+ i +"].DagList["+ j +"].CreatorId"));
				dag1.setIsDeleted(_ctx.booleanValue("ListLhTaskFlowAndScenarioResponse.ScenarioDAGList["+ i +"].DagList["+ j +"].IsDeleted"));
				dag1.setDemoId(_ctx.stringValue("ListLhTaskFlowAndScenarioResponse.ScenarioDAGList["+ i +"].DagList["+ j +"].DemoId"));
				dag1.setDeployId(_ctx.longValue("ListLhTaskFlowAndScenarioResponse.ScenarioDAGList["+ i +"].DagList["+ j +"].DeployId"));
				dag1.setDataFlowId(_ctx.longValue("ListLhTaskFlowAndScenarioResponse.ScenarioDAGList["+ i +"].DagList["+ j +"].DataFlowId"));
				dag1.setScenarioId(_ctx.longValue("ListLhTaskFlowAndScenarioResponse.ScenarioDAGList["+ i +"].DagList["+ j +"].ScenarioId"));
				dag1.setSpaceId(_ctx.longValue("ListLhTaskFlowAndScenarioResponse.ScenarioDAGList["+ i +"].DagList["+ j +"].SpaceId"));
				dag1.setCreatorNickName(_ctx.stringValue("ListLhTaskFlowAndScenarioResponse.ScenarioDAGList["+ i +"].DagList["+ j +"].CreatorNickName"));
				dag1.setDagOwnerNickName(_ctx.stringValue("ListLhTaskFlowAndScenarioResponse.ScenarioDAGList["+ i +"].DagList["+ j +"].DagOwnerNickName"));
				dag1.setCanEdit(_ctx.booleanValue("ListLhTaskFlowAndScenarioResponse.ScenarioDAGList["+ i +"].DagList["+ j +"].CanEdit"));
				dag1.setStatus(_ctx.integerValue("ListLhTaskFlowAndScenarioResponse.ScenarioDAGList["+ i +"].DagList["+ j +"].Status"));
				dag1.setLatestInstanceStatus(_ctx.integerValue("ListLhTaskFlowAndScenarioResponse.ScenarioDAGList["+ i +"].DagList["+ j +"].LatestInstanceStatus"));
				dag1.setLatestInstanceTime(_ctx.integerValue("ListLhTaskFlowAndScenarioResponse.ScenarioDAGList["+ i +"].DagList["+ j +"].LatestInstanceTime"));
				dag1.setDagName(_ctx.stringValue("ListLhTaskFlowAndScenarioResponse.ScenarioDAGList["+ i +"].DagList["+ j +"].DagName"));
				dag1.setDagOwnerId(_ctx.stringValue("ListLhTaskFlowAndScenarioResponse.ScenarioDAGList["+ i +"].DagList["+ j +"].DagOwnerId"));

				dagList.add(dag1);
			}
			scenarioDAG.setDagList(dagList);

			scenarioDAGList.add(scenarioDAG);
		}
		listLhTaskFlowAndScenarioResponse.setScenarioDAGList(scenarioDAGList);
	 
	 	return listLhTaskFlowAndScenarioResponse;
	}
}