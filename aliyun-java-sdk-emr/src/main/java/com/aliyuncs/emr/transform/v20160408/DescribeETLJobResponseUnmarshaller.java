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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.DescribeETLJobResponse;
import com.aliyuncs.emr.model.v20160408.DescribeETLJobResponse.AlertConfig;
import com.aliyuncs.emr.model.v20160408.DescribeETLJobResponse.AlertConfig.Item;
import com.aliyuncs.emr.model.v20160408.DescribeETLJobResponse.ClusterConfig;
import com.aliyuncs.emr.model.v20160408.DescribeETLJobResponse.ClusterConfig.DriverResource;
import com.aliyuncs.emr.model.v20160408.DescribeETLJobResponse.ClusterConfig.ExecutorResource;
import com.aliyuncs.emr.model.v20160408.DescribeETLJobResponse.Stage;
import com.aliyuncs.emr.model.v20160408.DescribeETLJobResponse.StageConnection;
import com.aliyuncs.emr.model.v20160408.DescribeETLJobResponse.TriggerRule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeETLJobResponseUnmarshaller {

	public static DescribeETLJobResponse unmarshall(DescribeETLJobResponse describeETLJobResponse, UnmarshallerContext context) {
		
		describeETLJobResponse.setRequestId(context.stringValue("DescribeETLJobResponse.RequestId"));
		describeETLJobResponse.setId(context.stringValue("DescribeETLJobResponse.Id"));
		describeETLJobResponse.setName(context.stringValue("DescribeETLJobResponse.Name"));
		describeETLJobResponse.setDescription(context.stringValue("DescribeETLJobResponse.Description"));
		describeETLJobResponse.setCategoryId(context.stringValue("DescribeETLJobResponse.CategoryId"));
		describeETLJobResponse.setGraph(context.stringValue("DescribeETLJobResponse.Graph"));

		ClusterConfig clusterConfig = new ClusterConfig();
		clusterConfig.setIsOnDemand(context.booleanValue("DescribeETLJobResponse.ClusterConfig.IsOnDemand"));
		clusterConfig.setClusterId(context.stringValue("DescribeETLJobResponse.ClusterConfig.ClusterId"));
		clusterConfig.setQueue(context.stringValue("DescribeETLJobResponse.ClusterConfig.Queue"));
		clusterConfig.setUserName(context.stringValue("DescribeETLJobResponse.ClusterConfig.UserName"));
		clusterConfig.setRecordRate(context.longValue("DescribeETLJobResponse.ClusterConfig.RecordRate"));
		clusterConfig.setSizeRate(context.longValue("DescribeETLJobResponse.ClusterConfig.SizeRate"));

		DriverResource driverResource = new DriverResource();
		driverResource.setVcores(context.integerValue("DescribeETLJobResponse.ClusterConfig.DriverResource.Vcores"));
		driverResource.setMemSize(context.integerValue("DescribeETLJobResponse.ClusterConfig.DriverResource.MemSize"));
		clusterConfig.setDriverResource(driverResource);

		ExecutorResource executorResource = new ExecutorResource();
		executorResource.setVcores(context.integerValue("DescribeETLJobResponse.ClusterConfig.ExecutorResource.Vcores"));
		executorResource.setMemSize(context.integerValue("DescribeETLJobResponse.ClusterConfig.ExecutorResource.MemSize"));
		clusterConfig.setExecutorResource(executorResource);
		describeETLJobResponse.setClusterConfig(clusterConfig);

		AlertConfig alertConfig = new AlertConfig();

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < context.lengthValue("DescribeETLJobResponse.AlertConfig.Items.Length"); i++) {
			Item item = new Item();
			item.setEnable(context.booleanValue("DescribeETLJobResponse.AlertConfig.Items["+ i +"].Enable"));
			item.setEventId(context.stringValue("DescribeETLJobResponse.AlertConfig.Items["+ i +"].EventId"));

			List<String> alertUserGroupIdList = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeETLJobResponse.AlertConfig.Items["+ i +"].AlertUserGroupIdList.Length"); j++) {
				alertUserGroupIdList.add(context.stringValue("DescribeETLJobResponse.AlertConfig.Items["+ i +"].AlertUserGroupIdList["+ j +"]"));
			}
			item.setAlertUserGroupIdList(alertUserGroupIdList);

			List<String> alertDingDingGroupIdList = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeETLJobResponse.AlertConfig.Items["+ i +"].AlertDingDingGroupIdList.Length"); j++) {
				alertDingDingGroupIdList.add(context.stringValue("DescribeETLJobResponse.AlertConfig.Items["+ i +"].AlertDingDingGroupIdList["+ j +"]"));
			}
			item.setAlertDingDingGroupIdList(alertDingDingGroupIdList);

			items.add(item);
		}
		alertConfig.setItems(items);
		describeETLJobResponse.setAlertConfig(alertConfig);

		List<TriggerRule> triggerRuleList = new ArrayList<TriggerRule>();
		for (int i = 0; i < context.lengthValue("DescribeETLJobResponse.TriggerRuleList.Length"); i++) {
			TriggerRule triggerRule = new TriggerRule();
			triggerRule.setEnabled(context.booleanValue("DescribeETLJobResponse.TriggerRuleList["+ i +"].Enabled"));
			triggerRule.setStartTime(context.longValue("DescribeETLJobResponse.TriggerRuleList["+ i +"].StartTime"));
			triggerRule.setEndTime(context.longValue("DescribeETLJobResponse.TriggerRuleList["+ i +"].EndTime"));
			triggerRule.setCronExpr(context.stringValue("DescribeETLJobResponse.TriggerRuleList["+ i +"].CronExpr"));

			triggerRuleList.add(triggerRule);
		}
		describeETLJobResponse.setTriggerRuleList(triggerRuleList);

		List<Stage> stageList = new ArrayList<Stage>();
		for (int i = 0; i < context.lengthValue("DescribeETLJobResponse.StageList.Length"); i++) {
			Stage stage = new Stage();
			stage.setStageName(context.stringValue("DescribeETLJobResponse.StageList["+ i +"].StageName"));
			stage.setStageType(context.stringValue("DescribeETLJobResponse.StageList["+ i +"].StageType"));
			stage.setStagePlugin(context.stringValue("DescribeETLJobResponse.StageList["+ i +"].StagePlugin"));
			stage.setStageConf(context.stringValue("DescribeETLJobResponse.StageList["+ i +"].StageConf"));

			stageList.add(stage);
		}
		describeETLJobResponse.setStageList(stageList);

		List<StageConnection> stageConnectionList = new ArrayList<StageConnection>();
		for (int i = 0; i < context.lengthValue("DescribeETLJobResponse.StageConnectionList.Length"); i++) {
			StageConnection stageConnection = new StageConnection();
			stageConnection.setFrom(context.stringValue("DescribeETLJobResponse.StageConnectionList["+ i +"].From"));
			stageConnection.setTo(context.stringValue("DescribeETLJobResponse.StageConnectionList["+ i +"].To"));
			stageConnection.setPort(context.stringValue("DescribeETLJobResponse.StageConnectionList["+ i +"].Port"));

			stageConnectionList.add(stageConnection);
		}
		describeETLJobResponse.setStageConnectionList(stageConnectionList);
	 
	 	return describeETLJobResponse;
	}
}