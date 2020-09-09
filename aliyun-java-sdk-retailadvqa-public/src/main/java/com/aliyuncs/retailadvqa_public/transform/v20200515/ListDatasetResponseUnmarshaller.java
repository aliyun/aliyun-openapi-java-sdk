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

package com.aliyuncs.retailadvqa_public.transform.v20200515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.retailadvqa_public.model.v20200515.ListDatasetResponse;
import com.aliyuncs.retailadvqa_public.model.v20200515.ListDatasetResponse.DataItem;
import com.aliyuncs.retailadvqa_public.model.v20200515.ListDatasetResponse.DataItem.ExtBehavior;
import com.aliyuncs.retailadvqa_public.model.v20200515.ListDatasetResponse.DataItem.ExtLabel;
import com.aliyuncs.retailadvqa_public.model.v20200515.ListDatasetResponse.DataItem.ExtLabel.DatasetLabelListItem;
import com.aliyuncs.retailadvqa_public.model.v20200515.ListDatasetResponse.DataItem.ExtRFM;
import com.aliyuncs.retailadvqa_public.model.v20200515.ListDatasetResponse.DataItem.ExtRFM.FrequencyScoreConfigItem;
import com.aliyuncs.retailadvqa_public.model.v20200515.ListDatasetResponse.DataItem.ExtRFM.MonetaryScoreConfigItem;
import com.aliyuncs.retailadvqa_public.model.v20200515.ListDatasetResponse.DataItem.ExtRFM.RecencyScoreConfigItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDatasetResponseUnmarshaller {

	public static ListDatasetResponse unmarshall(ListDatasetResponse listDatasetResponse, UnmarshallerContext _ctx) {
		
		listDatasetResponse.setRequestId(_ctx.stringValue("ListDatasetResponse.RequestId"));
		listDatasetResponse.setErrorCode(_ctx.stringValue("ListDatasetResponse.ErrorCode"));
		listDatasetResponse.setErrorDesc(_ctx.stringValue("ListDatasetResponse.ErrorDesc"));
		listDatasetResponse.setSuccess(_ctx.booleanValue("ListDatasetResponse.Success"));
		listDatasetResponse.setTraceId(_ctx.stringValue("ListDatasetResponse.TraceId"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListDatasetResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setId(_ctx.stringValue("ListDatasetResponse.Data["+ i +"].Id"));
			dataItem.setName(_ctx.stringValue("ListDatasetResponse.Data["+ i +"].Name"));
			dataItem.setDataSetType(_ctx.integerValue("ListDatasetResponse.Data["+ i +"].DataSetType"));
			dataItem.setFactTable(_ctx.stringValue("ListDatasetResponse.Data["+ i +"].FactTable"));
			dataItem.setUniqueMappingType(_ctx.stringValue("ListDatasetResponse.Data["+ i +"].UniqueMappingType"));
			dataItem.setUniqueFieldName(_ctx.stringValue("ListDatasetResponse.Data["+ i +"].UniqueFieldName"));
			dataItem.setExtMappingTypes(_ctx.mapValue("ListDatasetResponse.Data["+ i +"].ExtMappingTypes"));
			dataItem.setGmtCreate(_ctx.stringValue("ListDatasetResponse.Data["+ i +"].GmtCreate"));
			dataItem.setGmtModified(_ctx.stringValue("ListDatasetResponse.Data["+ i +"].GmtModified"));

			ExtRFM extRFM = new ExtRFM();
			extRFM.setTradeDateField(_ctx.stringValue("ListDatasetResponse.Data["+ i +"].ExtRFM.TradeDateField"));
			extRFM.setTradeFrequencyField(_ctx.stringValue("ListDatasetResponse.Data["+ i +"].ExtRFM.TradeFrequencyField"));
			extRFM.setTradeMoneyField(_ctx.stringValue("ListDatasetResponse.Data["+ i +"].ExtRFM.TradeMoneyField"));
			extRFM.setTradeMoneyUnit(_ctx.integerValue("ListDatasetResponse.Data["+ i +"].ExtRFM.TradeMoneyUnit"));
			extRFM.setDataFromType(_ctx.stringValue("ListDatasetResponse.Data["+ i +"].ExtRFM.DataFromType"));
			extRFM.setPeriod(_ctx.integerValue("ListDatasetResponse.Data["+ i +"].ExtRFM.Period"));
			extRFM.setComparisonCalculateType(_ctx.integerValue("ListDatasetResponse.Data["+ i +"].ExtRFM.ComparisonCalculateType"));
			extRFM.setRecencyScoreCompareValue(_ctx.stringValue("ListDatasetResponse.Data["+ i +"].ExtRFM.RecencyScoreCompareValue"));
			extRFM.setFrequencyScoreCompareValue(_ctx.stringValue("ListDatasetResponse.Data["+ i +"].ExtRFM.FrequencyScoreCompareValue"));
			extRFM.setMonetaryScoreCompareValue(_ctx.stringValue("ListDatasetResponse.Data["+ i +"].ExtRFM.MonetaryScoreCompareValue"));

			List<RecencyScoreConfigItem> recencyScoreConfig = new ArrayList<RecencyScoreConfigItem>();
			for (int j = 0; j < _ctx.lengthValue("ListDatasetResponse.Data["+ i +"].ExtRFM.RecencyScoreConfig.Length"); j++) {
				RecencyScoreConfigItem recencyScoreConfigItem = new RecencyScoreConfigItem();
				recencyScoreConfigItem.setStart(_ctx.integerValue("ListDatasetResponse.Data["+ i +"].ExtRFM.RecencyScoreConfig["+ j +"].Start"));
				recencyScoreConfigItem.setEnd(_ctx.integerValue("ListDatasetResponse.Data["+ i +"].ExtRFM.RecencyScoreConfig["+ j +"].End"));
				recencyScoreConfigItem.setScore(_ctx.integerValue("ListDatasetResponse.Data["+ i +"].ExtRFM.RecencyScoreConfig["+ j +"].Score"));

				recencyScoreConfig.add(recencyScoreConfigItem);
			}
			extRFM.setRecencyScoreConfig(recencyScoreConfig);

			List<FrequencyScoreConfigItem> frequencyScoreConfig = new ArrayList<FrequencyScoreConfigItem>();
			for (int j = 0; j < _ctx.lengthValue("ListDatasetResponse.Data["+ i +"].ExtRFM.FrequencyScoreConfig.Length"); j++) {
				FrequencyScoreConfigItem frequencyScoreConfigItem = new FrequencyScoreConfigItem();
				frequencyScoreConfigItem.setStart(_ctx.integerValue("ListDatasetResponse.Data["+ i +"].ExtRFM.FrequencyScoreConfig["+ j +"].Start"));
				frequencyScoreConfigItem.setEnd(_ctx.integerValue("ListDatasetResponse.Data["+ i +"].ExtRFM.FrequencyScoreConfig["+ j +"].End"));
				frequencyScoreConfigItem.setScore(_ctx.integerValue("ListDatasetResponse.Data["+ i +"].ExtRFM.FrequencyScoreConfig["+ j +"].Score"));

				frequencyScoreConfig.add(frequencyScoreConfigItem);
			}
			extRFM.setFrequencyScoreConfig(frequencyScoreConfig);

			List<MonetaryScoreConfigItem> monetaryScoreConfig = new ArrayList<MonetaryScoreConfigItem>();
			for (int j = 0; j < _ctx.lengthValue("ListDatasetResponse.Data["+ i +"].ExtRFM.MonetaryScoreConfig.Length"); j++) {
				MonetaryScoreConfigItem monetaryScoreConfigItem = new MonetaryScoreConfigItem();
				monetaryScoreConfigItem.setStart(_ctx.stringValue("ListDatasetResponse.Data["+ i +"].ExtRFM.MonetaryScoreConfig["+ j +"].Start"));
				monetaryScoreConfigItem.setEnd(_ctx.stringValue("ListDatasetResponse.Data["+ i +"].ExtRFM.MonetaryScoreConfig["+ j +"].End"));
				monetaryScoreConfigItem.setScore(_ctx.stringValue("ListDatasetResponse.Data["+ i +"].ExtRFM.MonetaryScoreConfig["+ j +"].Score"));

				monetaryScoreConfig.add(monetaryScoreConfigItem);
			}
			extRFM.setMonetaryScoreConfig(monetaryScoreConfig);
			dataItem.setExtRFM(extRFM);

			ExtBehavior extBehavior = new ExtBehavior();
			extBehavior.setBehaviorDateField(_ctx.stringValue("ListDatasetResponse.Data["+ i +"].ExtBehavior.BehaviorDateField"));
			extBehavior.setBehaviorTypeField(_ctx.stringValue("ListDatasetResponse.Data["+ i +"].ExtBehavior.BehaviorTypeField"));
			extBehavior.setBehaviorObjectTypeField(_ctx.stringValue("ListDatasetResponse.Data["+ i +"].ExtBehavior.BehaviorObjectTypeField"));
			extBehavior.setBehaviorObjectValueField(_ctx.stringValue("ListDatasetResponse.Data["+ i +"].ExtBehavior.BehaviorObjectValueField"));
			extBehavior.setBehaviorChannelField(_ctx.stringValue("ListDatasetResponse.Data["+ i +"].ExtBehavior.BehaviorChannelField"));
			extBehavior.setBehaviorCountsField(_ctx.stringValue("ListDatasetResponse.Data["+ i +"].ExtBehavior.BehaviorCountsField"));
			extBehavior.setBehaviorAmountsField(_ctx.stringValue("ListDatasetResponse.Data["+ i +"].ExtBehavior.BehaviorAmountsField"));
			extBehavior.setChannelDimTableName(_ctx.stringValue("ListDatasetResponse.Data["+ i +"].ExtBehavior.ChannelDimTableName"));
			extBehavior.setChannelField(_ctx.stringValue("ListDatasetResponse.Data["+ i +"].ExtBehavior.ChannelField"));
			extBehavior.setTypeDimTableName(_ctx.stringValue("ListDatasetResponse.Data["+ i +"].ExtBehavior.TypeDimTableName"));
			extBehavior.setTypeField(_ctx.stringValue("ListDatasetResponse.Data["+ i +"].ExtBehavior.TypeField"));
			extBehavior.setObjectTypeContext(_ctx.mapValue("ListDatasetResponse.Data["+ i +"].ExtBehavior.ObjectTypeContext"));
			dataItem.setExtBehavior(extBehavior);

			ExtLabel extLabel = new ExtLabel();

			List<DatasetLabelListItem> datasetLabelList = new ArrayList<DatasetLabelListItem>();
			for (int j = 0; j < _ctx.lengthValue("ListDatasetResponse.Data["+ i +"].ExtLabel.DatasetLabelList.Length"); j++) {
				DatasetLabelListItem datasetLabelListItem = new DatasetLabelListItem();
				datasetLabelListItem.setColumnName(_ctx.stringValue("ListDatasetResponse.Data["+ i +"].ExtLabel.DatasetLabelList["+ j +"].ColumnName"));
				datasetLabelListItem.setTableName(_ctx.stringValue("ListDatasetResponse.Data["+ i +"].ExtLabel.DatasetLabelList["+ j +"].TableName"));
				datasetLabelListItem.setColumnAlias(_ctx.stringValue("ListDatasetResponse.Data["+ i +"].ExtLabel.DatasetLabelList["+ j +"].ColumnAlias"));
				datasetLabelListItem.setColType(_ctx.stringValue("ListDatasetResponse.Data["+ i +"].ExtLabel.DatasetLabelList["+ j +"].ColType"));
				datasetLabelListItem.setLabelSeparator(_ctx.stringValue("ListDatasetResponse.Data["+ i +"].ExtLabel.DatasetLabelList["+ j +"].LabelSeparator"));
				datasetLabelListItem.setRemark(_ctx.stringValue("ListDatasetResponse.Data["+ i +"].ExtLabel.DatasetLabelList["+ j +"].Remark"));

				datasetLabelList.add(datasetLabelListItem);
			}
			extLabel.setDatasetLabelList(datasetLabelList);
			dataItem.setExtLabel(extLabel);

			data.add(dataItem);
		}
		listDatasetResponse.setData(data);
	 
	 	return listDatasetResponse;
	}
}