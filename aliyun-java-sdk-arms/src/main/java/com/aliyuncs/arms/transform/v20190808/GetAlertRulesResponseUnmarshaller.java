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

import com.aliyuncs.arms.model.v20190808.GetAlertRulesResponse;
import com.aliyuncs.arms.model.v20190808.GetAlertRulesResponse.PageBean;
import com.aliyuncs.arms.model.v20190808.GetAlertRulesResponse.PageBean.AlertRulesItem;
import com.aliyuncs.arms.model.v20190808.GetAlertRulesResponse.PageBean.AlertRulesItem.AlertRuleContent;
import com.aliyuncs.arms.model.v20190808.GetAlertRulesResponse.PageBean.AlertRulesItem.AlertRuleContent.AlertRuleItemsItem;
import com.aliyuncs.arms.model.v20190808.GetAlertRulesResponse.PageBean.AlertRulesItem.AnnotationsItem;
import com.aliyuncs.arms.model.v20190808.GetAlertRulesResponse.PageBean.AlertRulesItem.Filters;
import com.aliyuncs.arms.model.v20190808.GetAlertRulesResponse.PageBean.AlertRulesItem.Filters.CustomSLSFiltersItem;
import com.aliyuncs.arms.model.v20190808.GetAlertRulesResponse.PageBean.AlertRulesItem.Filters.DimFiltersItem;
import com.aliyuncs.arms.model.v20190808.GetAlertRulesResponse.PageBean.AlertRulesItem.LabelsItem;
import com.aliyuncs.arms.model.v20190808.GetAlertRulesResponse.PageBean.AlertRulesItem.TagsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAlertRulesResponseUnmarshaller {

	public static GetAlertRulesResponse unmarshall(GetAlertRulesResponse getAlertRulesResponse, UnmarshallerContext _ctx) {
		
		getAlertRulesResponse.setRequestId(_ctx.stringValue("GetAlertRulesResponse.RequestId"));

		PageBean pageBean = new PageBean();
		pageBean.setTotal(_ctx.longValue("GetAlertRulesResponse.PageBean.Total"));
		pageBean.setPage(_ctx.longValue("GetAlertRulesResponse.PageBean.Page"));
		pageBean.setSize(_ctx.longValue("GetAlertRulesResponse.PageBean.Size"));

		List<AlertRulesItem> alertRules = new ArrayList<AlertRulesItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAlertRulesResponse.PageBean.AlertRules.Length"); i++) {
			AlertRulesItem alertRulesItem = new AlertRulesItem();
			alertRulesItem.setAlertId(_ctx.longValue("GetAlertRulesResponse.PageBean.AlertRules["+ i +"].AlertId"));
			alertRulesItem.setAlertName(_ctx.stringValue("GetAlertRulesResponse.PageBean.AlertRules["+ i +"].AlertName"));
			alertRulesItem.setUserId(_ctx.stringValue("GetAlertRulesResponse.PageBean.AlertRules["+ i +"].UserId"));
			alertRulesItem.setRegionId(_ctx.stringValue("GetAlertRulesResponse.PageBean.AlertRules["+ i +"].RegionId"));
			alertRulesItem.setAlertType(_ctx.stringValue("GetAlertRulesResponse.PageBean.AlertRules["+ i +"].AlertType"));
			alertRulesItem.setAlertStatus(_ctx.stringValue("GetAlertRulesResponse.PageBean.AlertRules["+ i +"].AlertStatus"));
			alertRulesItem.setCreatedTime(_ctx.longValue("GetAlertRulesResponse.PageBean.AlertRules["+ i +"].CreatedTime"));
			alertRulesItem.setUpdatedTime(_ctx.longValue("GetAlertRulesResponse.PageBean.AlertRules["+ i +"].UpdatedTime"));
			alertRulesItem.setExtend(_ctx.stringValue("GetAlertRulesResponse.PageBean.AlertRules["+ i +"].Extend"));
			alertRulesItem.setNotifyStrategy(_ctx.stringValue("GetAlertRulesResponse.PageBean.AlertRules["+ i +"].NotifyStrategy"));
			alertRulesItem.setAutoAddNewApplication(_ctx.booleanValue("GetAlertRulesResponse.PageBean.AlertRules["+ i +"].AutoAddNewApplication"));
			alertRulesItem.setMetricsType(_ctx.stringValue("GetAlertRulesResponse.PageBean.AlertRules["+ i +"].MetricsType"));
			alertRulesItem.setAlertCheckType(_ctx.stringValue("GetAlertRulesResponse.PageBean.AlertRules["+ i +"].AlertCheckType"));
			alertRulesItem.setClusterId(_ctx.stringValue("GetAlertRulesResponse.PageBean.AlertRules["+ i +"].ClusterId"));
			alertRulesItem.setAlertGroup(_ctx.longValue("GetAlertRulesResponse.PageBean.AlertRules["+ i +"].AlertGroup"));
			alertRulesItem.setPromQL(_ctx.stringValue("GetAlertRulesResponse.PageBean.AlertRules["+ i +"].PromQL"));
			alertRulesItem.setDuration(_ctx.stringValue("GetAlertRulesResponse.PageBean.AlertRules["+ i +"].Duration"));
			alertRulesItem.setLevel(_ctx.stringValue("GetAlertRulesResponse.PageBean.AlertRules["+ i +"].Level"));
			alertRulesItem.setMessage(_ctx.stringValue("GetAlertRulesResponse.PageBean.AlertRules["+ i +"].Message"));
			alertRulesItem.setDurationCompareType(_ctx.stringValue("GetAlertRulesResponse.PageBean.AlertRules["+ i +"].DurationCompareType"));

			List<String> pids = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetAlertRulesResponse.PageBean.AlertRules["+ i +"].Pids.Length"); j++) {
				pids.add(_ctx.stringValue("GetAlertRulesResponse.PageBean.AlertRules["+ i +"].Pids["+ j +"]"));
			}
			alertRulesItem.setPids(pids);

			AlertRuleContent alertRuleContent = new AlertRuleContent();
			alertRuleContent.setCondition(_ctx.stringValue("GetAlertRulesResponse.PageBean.AlertRules["+ i +"].AlertRuleContent.Condition"));

			List<AlertRuleItemsItem> alertRuleItems = new ArrayList<AlertRuleItemsItem>();
			for (int j = 0; j < _ctx.lengthValue("GetAlertRulesResponse.PageBean.AlertRules["+ i +"].AlertRuleContent.AlertRuleItems.Length"); j++) {
				AlertRuleItemsItem alertRuleItemsItem = new AlertRuleItemsItem();
				alertRuleItemsItem.setN(_ctx.longValue("GetAlertRulesResponse.PageBean.AlertRules["+ i +"].AlertRuleContent.AlertRuleItems["+ j +"].N"));
				alertRuleItemsItem.setMetricKey(_ctx.stringValue("GetAlertRulesResponse.PageBean.AlertRules["+ i +"].AlertRuleContent.AlertRuleItems["+ j +"].MetricKey"));
				alertRuleItemsItem.setAggregate(_ctx.stringValue("GetAlertRulesResponse.PageBean.AlertRules["+ i +"].AlertRuleContent.AlertRuleItems["+ j +"].Aggregate"));
				alertRuleItemsItem.setOperator(_ctx.stringValue("GetAlertRulesResponse.PageBean.AlertRules["+ i +"].AlertRuleContent.AlertRuleItems["+ j +"].Operator"));
				alertRuleItemsItem.setValue(_ctx.stringValue("GetAlertRulesResponse.PageBean.AlertRules["+ i +"].AlertRuleContent.AlertRuleItems["+ j +"].Value"));

				alertRuleItems.add(alertRuleItemsItem);
			}
			alertRuleContent.setAlertRuleItems(alertRuleItems);
			alertRulesItem.setAlertRuleContent(alertRuleContent);

			Filters filters = new Filters();

			List<String> customSLSGroupByDimensions = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetAlertRulesResponse.PageBean.AlertRules["+ i +"].Filters.CustomSLSGroupByDimensions.Length"); j++) {
				customSLSGroupByDimensions.add(_ctx.stringValue("GetAlertRulesResponse.PageBean.AlertRules["+ i +"].Filters.CustomSLSGroupByDimensions["+ j +"]"));
			}
			filters.setCustomSLSGroupByDimensions(customSLSGroupByDimensions);

			List<String> customSLSWheres = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetAlertRulesResponse.PageBean.AlertRules["+ i +"].Filters.CustomSLSWheres.Length"); j++) {
				customSLSWheres.add(_ctx.stringValue("GetAlertRulesResponse.PageBean.AlertRules["+ i +"].Filters.CustomSLSWheres["+ j +"]"));
			}
			filters.setCustomSLSWheres(customSLSWheres);

			List<DimFiltersItem> dimFilters = new ArrayList<DimFiltersItem>();
			for (int j = 0; j < _ctx.lengthValue("GetAlertRulesResponse.PageBean.AlertRules["+ i +"].Filters.DimFilters.Length"); j++) {
				DimFiltersItem dimFiltersItem = new DimFiltersItem();
				dimFiltersItem.setFilterKey(_ctx.stringValue("GetAlertRulesResponse.PageBean.AlertRules["+ i +"].Filters.DimFilters["+ j +"].FilterKey"));
				dimFiltersItem.setFilterOpt(_ctx.stringValue("GetAlertRulesResponse.PageBean.AlertRules["+ i +"].Filters.DimFilters["+ j +"].FilterOpt"));

				List<String> filterValues = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("GetAlertRulesResponse.PageBean.AlertRules["+ i +"].Filters.DimFilters["+ j +"].FilterValues.Length"); k++) {
					filterValues.add(_ctx.stringValue("GetAlertRulesResponse.PageBean.AlertRules["+ i +"].Filters.DimFilters["+ j +"].FilterValues["+ k +"]"));
				}
				dimFiltersItem.setFilterValues(filterValues);

				dimFilters.add(dimFiltersItem);
			}
			filters.setDimFilters(dimFilters);

			List<CustomSLSFiltersItem> customSLSFilters = new ArrayList<CustomSLSFiltersItem>();
			for (int j = 0; j < _ctx.lengthValue("GetAlertRulesResponse.PageBean.AlertRules["+ i +"].Filters.CustomSLSFilters.Length"); j++) {
				CustomSLSFiltersItem customSLSFiltersItem = new CustomSLSFiltersItem();
				customSLSFiltersItem.setKey(_ctx.stringValue("GetAlertRulesResponse.PageBean.AlertRules["+ i +"].Filters.CustomSLSFilters["+ j +"].Key"));
				customSLSFiltersItem.setOpt(_ctx.stringValue("GetAlertRulesResponse.PageBean.AlertRules["+ i +"].Filters.CustomSLSFilters["+ j +"].Opt"));
				customSLSFiltersItem.setValue(_ctx.stringValue("GetAlertRulesResponse.PageBean.AlertRules["+ i +"].Filters.CustomSLSFilters["+ j +"].Value"));
				customSLSFiltersItem.setT(_ctx.stringValue("GetAlertRulesResponse.PageBean.AlertRules["+ i +"].Filters.CustomSLSFilters["+ j +"].T"));
				customSLSFiltersItem.setShow(_ctx.booleanValue("GetAlertRulesResponse.PageBean.AlertRules["+ i +"].Filters.CustomSLSFilters["+ j +"].Show"));

				customSLSFilters.add(customSLSFiltersItem);
			}
			filters.setCustomSLSFilters(customSLSFilters);
			alertRulesItem.setFilters(filters);

			List<LabelsItem> labels = new ArrayList<LabelsItem>();
			for (int j = 0; j < _ctx.lengthValue("GetAlertRulesResponse.PageBean.AlertRules["+ i +"].Labels.Length"); j++) {
				LabelsItem labelsItem = new LabelsItem();
				labelsItem.setName(_ctx.stringValue("GetAlertRulesResponse.PageBean.AlertRules["+ i +"].Labels["+ j +"].Name"));
				labelsItem.setValue(_ctx.stringValue("GetAlertRulesResponse.PageBean.AlertRules["+ i +"].Labels["+ j +"].Value"));

				labels.add(labelsItem);
			}
			alertRulesItem.setLabels(labels);

			List<AnnotationsItem> annotations = new ArrayList<AnnotationsItem>();
			for (int j = 0; j < _ctx.lengthValue("GetAlertRulesResponse.PageBean.AlertRules["+ i +"].Annotations.Length"); j++) {
				AnnotationsItem annotationsItem = new AnnotationsItem();
				annotationsItem.setName(_ctx.stringValue("GetAlertRulesResponse.PageBean.AlertRules["+ i +"].Annotations["+ j +"].Name"));
				annotationsItem.setValue(_ctx.stringValue("GetAlertRulesResponse.PageBean.AlertRules["+ i +"].Annotations["+ j +"].Value"));

				annotations.add(annotationsItem);
			}
			alertRulesItem.setAnnotations(annotations);

			List<TagsItem> tags = new ArrayList<TagsItem>();
			for (int j = 0; j < _ctx.lengthValue("GetAlertRulesResponse.PageBean.AlertRules["+ i +"].Tags.Length"); j++) {
				TagsItem tagsItem = new TagsItem();
				tagsItem.setKey(_ctx.stringValue("GetAlertRulesResponse.PageBean.AlertRules["+ i +"].Tags["+ j +"].Key"));
				tagsItem.setValue(_ctx.stringValue("GetAlertRulesResponse.PageBean.AlertRules["+ i +"].Tags["+ j +"].Value"));

				tags.add(tagsItem);
			}
			alertRulesItem.setTags(tags);

			alertRules.add(alertRulesItem);
		}
		pageBean.setAlertRules(alertRules);
		getAlertRulesResponse.setPageBean(pageBean);
	 
	 	return getAlertRulesResponse;
	}
}