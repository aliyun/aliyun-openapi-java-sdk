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

package com.aliyuncs.arms.transform.v20190808;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.arms.model.v20190808.CreateOrUpdateAlertRuleResponse;
import com.aliyuncs.arms.model.v20190808.CreateOrUpdateAlertRuleResponse.AlertRule;
import com.aliyuncs.arms.model.v20190808.CreateOrUpdateAlertRuleResponse.AlertRule.AlertRuleContent;
import com.aliyuncs.arms.model.v20190808.CreateOrUpdateAlertRuleResponse.AlertRule.AlertRuleContent.AlertRuleItemsItem;
import com.aliyuncs.arms.model.v20190808.CreateOrUpdateAlertRuleResponse.AlertRule.AnnotationsItem;
import com.aliyuncs.arms.model.v20190808.CreateOrUpdateAlertRuleResponse.AlertRule.Filters;
import com.aliyuncs.arms.model.v20190808.CreateOrUpdateAlertRuleResponse.AlertRule.Filters.CustomSLSFiltersItem;
import com.aliyuncs.arms.model.v20190808.CreateOrUpdateAlertRuleResponse.AlertRule.Filters.DimFiltersItem;
import com.aliyuncs.arms.model.v20190808.CreateOrUpdateAlertRuleResponse.AlertRule.LabelsItem;
import com.aliyuncs.arms.model.v20190808.CreateOrUpdateAlertRuleResponse.AlertRule.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateOrUpdateAlertRuleResponseUnmarshaller {

	public static CreateOrUpdateAlertRuleResponse unmarshall(CreateOrUpdateAlertRuleResponse createOrUpdateAlertRuleResponse, UnmarshallerContext _ctx) {
		
		createOrUpdateAlertRuleResponse.setRequestId(_ctx.stringValue("CreateOrUpdateAlertRuleResponse.RequestId"));

		AlertRule alertRule = new AlertRule();
		alertRule.setAlertId(_ctx.floatValue("CreateOrUpdateAlertRuleResponse.AlertRule.AlertId"));
		alertRule.setAlertName(_ctx.stringValue("CreateOrUpdateAlertRuleResponse.AlertRule.AlertName"));
		alertRule.setUserId(_ctx.stringValue("CreateOrUpdateAlertRuleResponse.AlertRule.UserId"));
		alertRule.setRegionId(_ctx.stringValue("CreateOrUpdateAlertRuleResponse.AlertRule.RegionId"));
		alertRule.setAlertType(_ctx.stringValue("CreateOrUpdateAlertRuleResponse.AlertRule.AlertType"));
		alertRule.setAlertStatus(_ctx.stringValue("CreateOrUpdateAlertRuleResponse.AlertRule.AlertStatus"));
		alertRule.setCreatedTime(_ctx.longValue("CreateOrUpdateAlertRuleResponse.AlertRule.CreatedTime"));
		alertRule.setUpdatedTime(_ctx.longValue("CreateOrUpdateAlertRuleResponse.AlertRule.UpdatedTime"));
		alertRule.setExtend(_ctx.stringValue("CreateOrUpdateAlertRuleResponse.AlertRule.Extend"));
		alertRule.setNotifyStrategy(_ctx.stringValue("CreateOrUpdateAlertRuleResponse.AlertRule.NotifyStrategy"));
		alertRule.setAutoAddNewApplication(_ctx.booleanValue("CreateOrUpdateAlertRuleResponse.AlertRule.AutoAddNewApplication"));
		alertRule.setMetricsType(_ctx.stringValue("CreateOrUpdateAlertRuleResponse.AlertRule.MetricsType"));
		alertRule.setAlertCheckType(_ctx.stringValue("CreateOrUpdateAlertRuleResponse.AlertRule.AlertCheckType"));
		alertRule.setClusterId(_ctx.stringValue("CreateOrUpdateAlertRuleResponse.AlertRule.ClusterId"));
		alertRule.setAlertGroup(_ctx.longValue("CreateOrUpdateAlertRuleResponse.AlertRule.AlertGroup"));
		alertRule.setPromQL(_ctx.stringValue("CreateOrUpdateAlertRuleResponse.AlertRule.PromQL"));
		alertRule.setDuration(_ctx.stringValue("CreateOrUpdateAlertRuleResponse.AlertRule.Duration"));
		alertRule.setLevel(_ctx.stringValue("CreateOrUpdateAlertRuleResponse.AlertRule.Level"));
		alertRule.setMessage(_ctx.stringValue("CreateOrUpdateAlertRuleResponse.AlertRule.Message"));

		List<String> pids = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateOrUpdateAlertRuleResponse.AlertRule.Pids.Length"); i++) {
			pids.add(_ctx.stringValue("CreateOrUpdateAlertRuleResponse.AlertRule.Pids["+ i +"]"));
		}
		alertRule.setPids(pids);

		AlertRuleContent alertRuleContent = new AlertRuleContent();
		alertRuleContent.setCondition(_ctx.stringValue("CreateOrUpdateAlertRuleResponse.AlertRule.AlertRuleContent.Condition"));

		List<AlertRuleItemsItem> alertRuleItems = new ArrayList<AlertRuleItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("CreateOrUpdateAlertRuleResponse.AlertRule.AlertRuleContent.AlertRuleItems.Length"); i++) {
			AlertRuleItemsItem alertRuleItemsItem = new AlertRuleItemsItem();
			alertRuleItemsItem.setN(_ctx.floatValue("CreateOrUpdateAlertRuleResponse.AlertRule.AlertRuleContent.AlertRuleItems["+ i +"].N"));
			alertRuleItemsItem.setMetricKey(_ctx.stringValue("CreateOrUpdateAlertRuleResponse.AlertRule.AlertRuleContent.AlertRuleItems["+ i +"].MetricKey"));
			alertRuleItemsItem.setAggregate(_ctx.stringValue("CreateOrUpdateAlertRuleResponse.AlertRule.AlertRuleContent.AlertRuleItems["+ i +"].Aggregate"));
			alertRuleItemsItem.setOperator(_ctx.stringValue("CreateOrUpdateAlertRuleResponse.AlertRule.AlertRuleContent.AlertRuleItems["+ i +"].Operator"));
			alertRuleItemsItem.setValue(_ctx.stringValue("CreateOrUpdateAlertRuleResponse.AlertRule.AlertRuleContent.AlertRuleItems["+ i +"].Value"));

			alertRuleItems.add(alertRuleItemsItem);
		}
		alertRuleContent.setAlertRuleItems(alertRuleItems);
		alertRule.setAlertRuleContent(alertRuleContent);

		Filters filters = new Filters();

		List<String> customSLSGroupByDimensions = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateOrUpdateAlertRuleResponse.AlertRule.Filters.CustomSLSGroupByDimensions.Length"); i++) {
			customSLSGroupByDimensions.add(_ctx.stringValue("CreateOrUpdateAlertRuleResponse.AlertRule.Filters.CustomSLSGroupByDimensions["+ i +"]"));
		}
		filters.setCustomSLSGroupByDimensions(customSLSGroupByDimensions);

		List<String> customSLSWheres = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateOrUpdateAlertRuleResponse.AlertRule.Filters.CustomSLSWheres.Length"); i++) {
			customSLSWheres.add(_ctx.stringValue("CreateOrUpdateAlertRuleResponse.AlertRule.Filters.CustomSLSWheres["+ i +"]"));
		}
		filters.setCustomSLSWheres(customSLSWheres);

		List<DimFiltersItem> dimFilters = new ArrayList<DimFiltersItem>();
		for (int i = 0; i < _ctx.lengthValue("CreateOrUpdateAlertRuleResponse.AlertRule.Filters.DimFilters.Length"); i++) {
			DimFiltersItem dimFiltersItem = new DimFiltersItem();
			dimFiltersItem.setFilterKey(_ctx.stringValue("CreateOrUpdateAlertRuleResponse.AlertRule.Filters.DimFilters["+ i +"].FilterKey"));
			dimFiltersItem.setFilterOpt(_ctx.stringValue("CreateOrUpdateAlertRuleResponse.AlertRule.Filters.DimFilters["+ i +"].FilterOpt"));

			List<String> filterValues = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("CreateOrUpdateAlertRuleResponse.AlertRule.Filters.DimFilters["+ i +"].FilterValues.Length"); j++) {
				filterValues.add(_ctx.stringValue("CreateOrUpdateAlertRuleResponse.AlertRule.Filters.DimFilters["+ i +"].FilterValues["+ j +"]"));
			}
			dimFiltersItem.setFilterValues(filterValues);

			dimFilters.add(dimFiltersItem);
		}
		filters.setDimFilters(dimFilters);

		List<CustomSLSFiltersItem> customSLSFilters = new ArrayList<CustomSLSFiltersItem>();
		for (int i = 0; i < _ctx.lengthValue("CreateOrUpdateAlertRuleResponse.AlertRule.Filters.CustomSLSFilters.Length"); i++) {
			CustomSLSFiltersItem customSLSFiltersItem = new CustomSLSFiltersItem();
			customSLSFiltersItem.setKey(_ctx.stringValue("CreateOrUpdateAlertRuleResponse.AlertRule.Filters.CustomSLSFilters["+ i +"].Key"));
			customSLSFiltersItem.setOpt(_ctx.stringValue("CreateOrUpdateAlertRuleResponse.AlertRule.Filters.CustomSLSFilters["+ i +"].Opt"));
			customSLSFiltersItem.setValue(_ctx.stringValue("CreateOrUpdateAlertRuleResponse.AlertRule.Filters.CustomSLSFilters["+ i +"].Value"));
			customSLSFiltersItem.setT(_ctx.stringValue("CreateOrUpdateAlertRuleResponse.AlertRule.Filters.CustomSLSFilters["+ i +"].T"));
			customSLSFiltersItem.setShow(_ctx.booleanValue("CreateOrUpdateAlertRuleResponse.AlertRule.Filters.CustomSLSFilters["+ i +"].Show"));

			customSLSFilters.add(customSLSFiltersItem);
		}
		filters.setCustomSLSFilters(customSLSFilters);
		alertRule.setFilters(filters);

		List<LabelsItem> labels = new ArrayList<LabelsItem>();
		for (int i = 0; i < _ctx.lengthValue("CreateOrUpdateAlertRuleResponse.AlertRule.Labels.Length"); i++) {
			LabelsItem labelsItem = new LabelsItem();
			labelsItem.setName(_ctx.stringValue("CreateOrUpdateAlertRuleResponse.AlertRule.Labels["+ i +"].Name"));
			labelsItem.setValue(_ctx.stringValue("CreateOrUpdateAlertRuleResponse.AlertRule.Labels["+ i +"].Value"));

			labels.add(labelsItem);
		}
		alertRule.setLabels(labels);

		List<AnnotationsItem> annotations = new ArrayList<AnnotationsItem>();
		for (int i = 0; i < _ctx.lengthValue("CreateOrUpdateAlertRuleResponse.AlertRule.Annotations.Length"); i++) {
			AnnotationsItem annotationsItem = new AnnotationsItem();
			annotationsItem.setName(_ctx.stringValue("CreateOrUpdateAlertRuleResponse.AlertRule.Annotations["+ i +"].Name"));
			annotationsItem.setValue(_ctx.stringValue("CreateOrUpdateAlertRuleResponse.AlertRule.Annotations["+ i +"].Value"));

			annotations.add(annotationsItem);
		}
		alertRule.setAnnotations(annotations);

		List<Tag> tags = new ArrayList<Tag>();
		for (int i = 0; i < _ctx.lengthValue("CreateOrUpdateAlertRuleResponse.AlertRule.Tags.Length"); i++) {
			Tag tag = new Tag();
			tag.setKey(_ctx.stringValue("CreateOrUpdateAlertRuleResponse.AlertRule.Tags["+ i +"].Key"));
			tag.setValue(_ctx.stringValue("CreateOrUpdateAlertRuleResponse.AlertRule.Tags["+ i +"].Value"));

			tags.add(tag);
		}
		alertRule.setTags(tags);
		createOrUpdateAlertRuleResponse.setAlertRule(alertRule);
	 
	 	return createOrUpdateAlertRuleResponse;
	}
}