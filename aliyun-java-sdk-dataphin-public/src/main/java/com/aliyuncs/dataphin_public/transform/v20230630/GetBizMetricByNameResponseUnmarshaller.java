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

import com.aliyuncs.dataphin_public.model.v20230630.GetBizMetricByNameResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetBizMetricByNameResponse.Data;
import com.aliyuncs.dataphin_public.model.v20230630.GetBizMetricByNameResponse.Data.AssociatedTechMetricsItem;
import com.aliyuncs.dataphin_public.model.v20230630.GetBizMetricByNameResponse.Data.RelatedBizMetricsItem;
import com.aliyuncs.dataphin_public.model.v20230630.GetBizMetricByNameResponse.Data.ViewScope;
import com.aliyuncs.dataphin_public.model.v20230630.GetBizMetricByNameResponse.Data.归属目录列表;
import com.aliyuncs.dataphin_public.model.v20230630.GetBizMetricByNameResponse.Data.自定义属性;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetBizMetricByNameResponseUnmarshaller {

	public static GetBizMetricByNameResponse unmarshall(GetBizMetricByNameResponse getBizMetricByNameResponse, UnmarshallerContext _ctx) {
		
		getBizMetricByNameResponse.setRequestId(_ctx.stringValue("GetBizMetricByNameResponse.RequestId"));
		getBizMetricByNameResponse.setSuccess(_ctx.booleanValue("GetBizMetricByNameResponse.Success"));
		getBizMetricByNameResponse.setHttpStatusCode(_ctx.integerValue("GetBizMetricByNameResponse.HttpStatusCode"));
		getBizMetricByNameResponse.setCode(_ctx.stringValue("GetBizMetricByNameResponse.Code"));
		getBizMetricByNameResponse.setMessage(_ctx.stringValue("GetBizMetricByNameResponse.Message"));

		Data data = new Data();
		data.setTenantId(_ctx.longValue("GetBizMetricByNameResponse.Data.TenantId"));
		data.setGuid(_ctx.stringValue("GetBizMetricByNameResponse.Data.Guid"));
		data.setName(_ctx.stringValue("GetBizMetricByNameResponse.Data.Name"));
		data.setDisplayName(_ctx.stringValue("GetBizMetricByNameResponse.Data.DisplayName"));
		data.setDescription(_ctx.stringValue("GetBizMetricByNameResponse.Data.Description"));
		data.setBizOwnerName(_ctx.stringValue("GetBizMetricByNameResponse.Data.BizOwnerName"));
		data.setMetricDefinition(_ctx.stringValue("GetBizMetricByNameResponse.Data.MetricDefinition"));
		data.setMetricRelationDiagramSwitchOpen(_ctx.booleanValue("GetBizMetricByNameResponse.Data.MetricRelationDiagramSwitchOpen"));
		data.setMetricRelationDiagramExpression(_ctx.stringValue("GetBizMetricByNameResponse.Data.MetricRelationDiagramExpression"));
		data.setOperateInstructionEnabled(_ctx.booleanValue("GetBizMetricByNameResponse.Data.OperateInstructionEnabled"));
		data.setOperateInstructionContent(_ctx.stringValue("GetBizMetricByNameResponse.Data.OperateInstructionContent"));

		List<String> labels = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetBizMetricByNameResponse.Data.Labels.Length"); i++) {
			labels.add(_ctx.stringValue("GetBizMetricByNameResponse.Data.Labels["+ i +"]"));
		}
		data.setLabels(labels);

		ViewScope viewScope = new ViewScope();
		viewScope.setScopeType(_ctx.stringValue("GetBizMetricByNameResponse.Data.ViewScope.ScopeType"));

		List<String> userNames = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetBizMetricByNameResponse.Data.ViewScope.UserNames.Length"); i++) {
			userNames.add(_ctx.stringValue("GetBizMetricByNameResponse.Data.ViewScope.UserNames["+ i +"]"));
		}
		viewScope.setUserNames(userNames);

		List<String> userGroupNames = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetBizMetricByNameResponse.Data.ViewScope.UserGroupNames.Length"); i++) {
			userGroupNames.add(_ctx.stringValue("GetBizMetricByNameResponse.Data.ViewScope.UserGroupNames["+ i +"]"));
		}
		viewScope.setUserGroupNames(userGroupNames);
		data.setViewScope(viewScope);

		List<归属目录列表> catalogs = new ArrayList<归属目录列表>();
		for (int i = 0; i < _ctx.lengthValue("GetBizMetricByNameResponse.Data.Catalogs.Length"); i++) {
			归属目录列表 归属目录列表 = new 归属目录列表();
			归属目录列表.setTopicId(_ctx.longValue("GetBizMetricByNameResponse.Data.Catalogs["+ i +"].TopicId"));
			归属目录列表.setTopicName(_ctx.stringValue("GetBizMetricByNameResponse.Data.Catalogs["+ i +"].TopicName"));
			归属目录列表.setCatalogId(_ctx.longValue("GetBizMetricByNameResponse.Data.Catalogs["+ i +"].CatalogId"));
			归属目录列表.setCatalogName(_ctx.stringValue("GetBizMetricByNameResponse.Data.Catalogs["+ i +"].CatalogName"));
			归属目录列表.setCatalogDesc(_ctx.stringValue("GetBizMetricByNameResponse.Data.Catalogs["+ i +"].CatalogDesc"));
			归属目录列表.setParentCatalogId(_ctx.longValue("GetBizMetricByNameResponse.Data.Catalogs["+ i +"].ParentCatalogId"));
			归属目录列表.setParentPath(_ctx.stringValue("GetBizMetricByNameResponse.Data.Catalogs["+ i +"].ParentPath"));

			catalogs.add(归属目录列表);
		}
		data.setCatalogs(catalogs);

		List<RelatedBizMetricsItem> relatedBizMetrics = new ArrayList<RelatedBizMetricsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetBizMetricByNameResponse.Data.RelatedBizMetrics.Length"); i++) {
			RelatedBizMetricsItem relatedBizMetricsItem = new RelatedBizMetricsItem();
			relatedBizMetricsItem.setGuid(_ctx.stringValue("GetBizMetricByNameResponse.Data.RelatedBizMetrics["+ i +"].Guid"));
			relatedBizMetricsItem.setName(_ctx.stringValue("GetBizMetricByNameResponse.Data.RelatedBizMetrics["+ i +"].Name"));
			relatedBizMetricsItem.setDisplayName(_ctx.stringValue("GetBizMetricByNameResponse.Data.RelatedBizMetrics["+ i +"].DisplayName"));
			relatedBizMetricsItem.setDescription(_ctx.stringValue("GetBizMetricByNameResponse.Data.RelatedBizMetrics["+ i +"].Description"));
			relatedBizMetricsItem.setRelationType(_ctx.stringValue("GetBizMetricByNameResponse.Data.RelatedBizMetrics["+ i +"].RelationType"));

			relatedBizMetrics.add(relatedBizMetricsItem);
		}
		data.setRelatedBizMetrics(relatedBizMetrics);

		List<AssociatedTechMetricsItem> associatedTechMetrics = new ArrayList<AssociatedTechMetricsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetBizMetricByNameResponse.Data.AssociatedTechMetrics.Length"); i++) {
			AssociatedTechMetricsItem associatedTechMetricsItem = new AssociatedTechMetricsItem();
			associatedTechMetricsItem.setGuid(_ctx.stringValue("GetBizMetricByNameResponse.Data.AssociatedTechMetrics["+ i +"].Guid"));
			associatedTechMetricsItem.setName(_ctx.stringValue("GetBizMetricByNameResponse.Data.AssociatedTechMetrics["+ i +"].Name"));
			associatedTechMetricsItem.setDisplayName(_ctx.stringValue("GetBizMetricByNameResponse.Data.AssociatedTechMetrics["+ i +"].DisplayName"));
			associatedTechMetricsItem.setDescription(_ctx.stringValue("GetBizMetricByNameResponse.Data.AssociatedTechMetrics["+ i +"].Description"));
			associatedTechMetricsItem.setSubType(_ctx.stringValue("GetBizMetricByNameResponse.Data.AssociatedTechMetrics["+ i +"].SubType"));

			associatedTechMetrics.add(associatedTechMetricsItem);
		}
		data.setAssociatedTechMetrics(associatedTechMetrics);

		List<自定义属性> customAttribute = new ArrayList<自定义属性>();
		for (int i = 0; i < _ctx.lengthValue("GetBizMetricByNameResponse.Data.CustomAttribute.Length"); i++) {
			自定义属性 自定义属性 = new 自定义属性();
			自定义属性.setCode(_ctx.stringValue("GetBizMetricByNameResponse.Data.CustomAttribute["+ i +"].Code"));

			List<String> values = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetBizMetricByNameResponse.Data.CustomAttribute["+ i +"].Values.Length"); j++) {
				values.add(_ctx.stringValue("GetBizMetricByNameResponse.Data.CustomAttribute["+ i +"].Values["+ j +"]"));
			}
			自定义属性.setValues(values);

			customAttribute.add(自定义属性);
		}
		data.setCustomAttribute(customAttribute);
		getBizMetricByNameResponse.setData(data);
	 
	 	return getBizMetricByNameResponse;
	}
}