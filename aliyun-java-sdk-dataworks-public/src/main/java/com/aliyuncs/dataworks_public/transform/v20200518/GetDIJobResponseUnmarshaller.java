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

import com.aliyuncs.dataworks_public.model.v20200518.GetDIJobResponse;
import com.aliyuncs.dataworks_public.model.v20200518.GetDIJobResponse.Data;
import com.aliyuncs.dataworks_public.model.v20200518.GetDIJobResponse.Data.DestinationDataSourceSetting;
import com.aliyuncs.dataworks_public.model.v20200518.GetDIJobResponse.Data.JobSettings;
import com.aliyuncs.dataworks_public.model.v20200518.GetDIJobResponse.Data.JobSettings.ColumnDataTypeSetting;
import com.aliyuncs.dataworks_public.model.v20200518.GetDIJobResponse.Data.JobSettings.CycleScheduleSettings;
import com.aliyuncs.dataworks_public.model.v20200518.GetDIJobResponse.Data.JobSettings.DdlHandlingSetting;
import com.aliyuncs.dataworks_public.model.v20200518.GetDIJobResponse.Data.JobSettings.RuntimeSetting;
import com.aliyuncs.dataworks_public.model.v20200518.GetDIJobResponse.Data.ResourceSettings;
import com.aliyuncs.dataworks_public.model.v20200518.GetDIJobResponse.Data.ResourceSettings.OfflineResourceSettings;
import com.aliyuncs.dataworks_public.model.v20200518.GetDIJobResponse.Data.ResourceSettings.RealtimeResourceSettings;
import com.aliyuncs.dataworks_public.model.v20200518.GetDIJobResponse.Data.SourceDataSourceSetting;
import com.aliyuncs.dataworks_public.model.v20200518.GetDIJobResponse.Data.TableMapping;
import com.aliyuncs.dataworks_public.model.v20200518.GetDIJobResponse.Data.TableMapping.SourceObjectSelectionRule;
import com.aliyuncs.dataworks_public.model.v20200518.GetDIJobResponse.Data.TableMapping.TransformationRule2;
import com.aliyuncs.dataworks_public.model.v20200518.GetDIJobResponse.Data.TransformationRule;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDIJobResponseUnmarshaller {

	public static GetDIJobResponse unmarshall(GetDIJobResponse getDIJobResponse, UnmarshallerContext _ctx) {
		
		getDIJobResponse.setRequestId(_ctx.stringValue("GetDIJobResponse.RequestId"));

		Data data = new Data();
		data.setProjectId(_ctx.longValue("GetDIJobResponse.Data.ProjectId"));
		data.setDIJobId(_ctx.longValue("GetDIJobResponse.Data.DIJobId"));
		data.setJobName(_ctx.stringValue("GetDIJobResponse.Data.JobName"));
		data.setDescription(_ctx.stringValue("GetDIJobResponse.Data.Description"));
		data.setMigrationType(_ctx.stringValue("GetDIJobResponse.Data.MigrationType"));
		data.setSourceDataSourceType(_ctx.stringValue("GetDIJobResponse.Data.SourceDataSourceType"));
		data.setDestinationDataSourceType(_ctx.stringValue("GetDIJobResponse.Data.DestinationDataSourceType"));
		data.setCreatedTime(_ctx.longValue("GetDIJobResponse.Data.CreatedTime"));
		data.setCreatedUid(_ctx.stringValue("GetDIJobResponse.Data.CreatedUid"));
		data.setUpdatedTime(_ctx.longValue("GetDIJobResponse.Data.UpdatedTime"));
		data.setUpdatedUid(_ctx.stringValue("GetDIJobResponse.Data.UpdatedUid"));
		data.setStartedTime(_ctx.longValue("GetDIJobResponse.Data.StartedTime"));
		data.setStartedUid(_ctx.stringValue("GetDIJobResponse.Data.StartedUid"));
		data.setJobStatus(_ctx.stringValue("GetDIJobResponse.Data.JobStatus"));
		data.setErrorMessage(_ctx.stringValue("GetDIJobResponse.Data.ErrorMessage"));
		data.setRunStats(_ctx.mapValue("GetDIJobResponse.Data.RunStats"));

		ResourceSettings resourceSettings = new ResourceSettings();
		resourceSettings.setRequestedCu(_ctx.floatValue("GetDIJobResponse.Data.ResourceSettings.RequestedCu"));

		OfflineResourceSettings offlineResourceSettings = new OfflineResourceSettings();
		offlineResourceSettings.setResourceGroupIdentifier(_ctx.stringValue("GetDIJobResponse.Data.ResourceSettings.OfflineResourceSettings.ResourceGroupIdentifier"));
		resourceSettings.setOfflineResourceSettings(offlineResourceSettings);

		RealtimeResourceSettings realtimeResourceSettings = new RealtimeResourceSettings();
		realtimeResourceSettings.setResourceGroupIdentifier(_ctx.stringValue("GetDIJobResponse.Data.ResourceSettings.RealtimeResourceSettings.ResourceGroupIdentifier"));
		resourceSettings.setRealtimeResourceSettings(realtimeResourceSettings);
		data.setResourceSettings(resourceSettings);

		JobSettings jobSettings = new JobSettings();
		jobSettings.setChannelSettings(_ctx.stringValue("GetDIJobResponse.Data.JobSettings.ChannelSettings"));

		CycleScheduleSettings cycleScheduleSettings = new CycleScheduleSettings();
		cycleScheduleSettings.setCycleMigrationType(_ctx.stringValue("GetDIJobResponse.Data.JobSettings.CycleScheduleSettings.CycleMigrationType"));
		cycleScheduleSettings.setScheduleParameters(_ctx.stringValue("GetDIJobResponse.Data.JobSettings.CycleScheduleSettings.ScheduleParameters"));
		jobSettings.setCycleScheduleSettings(cycleScheduleSettings);

		List<ColumnDataTypeSetting> columnDataTypeSettings = new ArrayList<ColumnDataTypeSetting>();
		for (int i = 0; i < _ctx.lengthValue("GetDIJobResponse.Data.JobSettings.ColumnDataTypeSettings.Length"); i++) {
			ColumnDataTypeSetting columnDataTypeSetting = new ColumnDataTypeSetting();
			columnDataTypeSetting.setSourceDataType(_ctx.stringValue("GetDIJobResponse.Data.JobSettings.ColumnDataTypeSettings["+ i +"].SourceDataType"));
			columnDataTypeSetting.setDestinationDataType(_ctx.stringValue("GetDIJobResponse.Data.JobSettings.ColumnDataTypeSettings["+ i +"].DestinationDataType"));

			columnDataTypeSettings.add(columnDataTypeSetting);
		}
		jobSettings.setColumnDataTypeSettings(columnDataTypeSettings);

		List<DdlHandlingSetting> ddlHandlingSettings = new ArrayList<DdlHandlingSetting>();
		for (int i = 0; i < _ctx.lengthValue("GetDIJobResponse.Data.JobSettings.DdlHandlingSettings.Length"); i++) {
			DdlHandlingSetting ddlHandlingSetting = new DdlHandlingSetting();
			ddlHandlingSetting.setAction(_ctx.stringValue("GetDIJobResponse.Data.JobSettings.DdlHandlingSettings["+ i +"].Action"));
			ddlHandlingSetting.setType(_ctx.stringValue("GetDIJobResponse.Data.JobSettings.DdlHandlingSettings["+ i +"].Type"));

			ddlHandlingSettings.add(ddlHandlingSetting);
		}
		jobSettings.setDdlHandlingSettings(ddlHandlingSettings);

		List<RuntimeSetting> runtimeSettings = new ArrayList<RuntimeSetting>();
		for (int i = 0; i < _ctx.lengthValue("GetDIJobResponse.Data.JobSettings.RuntimeSettings.Length"); i++) {
			RuntimeSetting runtimeSetting = new RuntimeSetting();
			runtimeSetting.setName(_ctx.stringValue("GetDIJobResponse.Data.JobSettings.RuntimeSettings["+ i +"].Name"));
			runtimeSetting.setValue(_ctx.stringValue("GetDIJobResponse.Data.JobSettings.RuntimeSettings["+ i +"].Value"));

			runtimeSettings.add(runtimeSetting);
		}
		jobSettings.setRuntimeSettings(runtimeSettings);
		data.setJobSettings(jobSettings);

		List<SourceDataSourceSetting> sourceDataSourceSettings = new ArrayList<SourceDataSourceSetting>();
		for (int i = 0; i < _ctx.lengthValue("GetDIJobResponse.Data.SourceDataSourceSettings.Length"); i++) {
			SourceDataSourceSetting sourceDataSourceSetting = new SourceDataSourceSetting();
			sourceDataSourceSetting.setDataSourceName(_ctx.stringValue("GetDIJobResponse.Data.SourceDataSourceSettings["+ i +"].DataSourceName"));
			sourceDataSourceSetting.setDataSourceProperties(_ctx.mapValue("GetDIJobResponse.Data.SourceDataSourceSettings["+ i +"].DataSourceProperties"));

			sourceDataSourceSettings.add(sourceDataSourceSetting);
		}
		data.setSourceDataSourceSettings(sourceDataSourceSettings);

		List<DestinationDataSourceSetting> destinationDataSourceSettings = new ArrayList<DestinationDataSourceSetting>();
		for (int i = 0; i < _ctx.lengthValue("GetDIJobResponse.Data.DestinationDataSourceSettings.Length"); i++) {
			DestinationDataSourceSetting destinationDataSourceSetting = new DestinationDataSourceSetting();
			destinationDataSourceSetting.setDataSourceName(_ctx.stringValue("GetDIJobResponse.Data.DestinationDataSourceSettings["+ i +"].DataSourceName"));
			destinationDataSourceSetting.setDataSourceProperties(_ctx.mapValue("GetDIJobResponse.Data.DestinationDataSourceSettings["+ i +"].DataSourceProperties"));

			destinationDataSourceSettings.add(destinationDataSourceSetting);
		}
		data.setDestinationDataSourceSettings(destinationDataSourceSettings);

		List<TransformationRule> transformationRules = new ArrayList<TransformationRule>();
		for (int i = 0; i < _ctx.lengthValue("GetDIJobResponse.Data.TransformationRules.Length"); i++) {
			TransformationRule transformationRule = new TransformationRule();
			transformationRule.setRuleActionType(_ctx.stringValue("GetDIJobResponse.Data.TransformationRules["+ i +"].RuleActionType"));
			transformationRule.setRuleExpression(_ctx.stringValue("GetDIJobResponse.Data.TransformationRules["+ i +"].RuleExpression"));
			transformationRule.setRuleName(_ctx.stringValue("GetDIJobResponse.Data.TransformationRules["+ i +"].RuleName"));
			transformationRule.setRuleTargetType(_ctx.stringValue("GetDIJobResponse.Data.TransformationRules["+ i +"].RuleTargetType"));

			transformationRules.add(transformationRule);
		}
		data.setTransformationRules(transformationRules);

		List<TableMapping> tableMappings = new ArrayList<TableMapping>();
		for (int i = 0; i < _ctx.lengthValue("GetDIJobResponse.Data.TableMappings.Length"); i++) {
			TableMapping tableMapping = new TableMapping();

			List<SourceObjectSelectionRule> sourceObjectSelectionRules = new ArrayList<SourceObjectSelectionRule>();
			for (int j = 0; j < _ctx.lengthValue("GetDIJobResponse.Data.TableMappings["+ i +"].SourceObjectSelectionRules.Length"); j++) {
				SourceObjectSelectionRule sourceObjectSelectionRule = new SourceObjectSelectionRule();
				sourceObjectSelectionRule.setExpression(_ctx.stringValue("GetDIJobResponse.Data.TableMappings["+ i +"].SourceObjectSelectionRules["+ j +"].Expression"));
				sourceObjectSelectionRule.setObjectType(_ctx.stringValue("GetDIJobResponse.Data.TableMappings["+ i +"].SourceObjectSelectionRules["+ j +"].ObjectType"));

				sourceObjectSelectionRules.add(sourceObjectSelectionRule);
			}
			tableMapping.setSourceObjectSelectionRules(sourceObjectSelectionRules);

			List<TransformationRule2> transformationRules1 = new ArrayList<TransformationRule2>();
			for (int j = 0; j < _ctx.lengthValue("GetDIJobResponse.Data.TableMappings["+ i +"].TransformationRules.Length"); j++) {
				TransformationRule2 transformationRule2 = new TransformationRule2();
				transformationRule2.setRuleActionType(_ctx.stringValue("GetDIJobResponse.Data.TableMappings["+ i +"].TransformationRules["+ j +"].RuleActionType"));
				transformationRule2.setRuleName(_ctx.stringValue("GetDIJobResponse.Data.TableMappings["+ i +"].TransformationRules["+ j +"].RuleName"));
				transformationRule2.setRuleTargetType(_ctx.stringValue("GetDIJobResponse.Data.TableMappings["+ i +"].TransformationRules["+ j +"].RuleTargetType"));

				transformationRules1.add(transformationRule2);
			}
			tableMapping.setTransformationRules1(transformationRules1);

			tableMappings.add(tableMapping);
		}
		data.setTableMappings(tableMappings);
		getDIJobResponse.setData(data);
	 
	 	return getDIJobResponse;
	}
}