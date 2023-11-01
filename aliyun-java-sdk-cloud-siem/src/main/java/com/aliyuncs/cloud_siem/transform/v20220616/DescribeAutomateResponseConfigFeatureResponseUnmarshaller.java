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

package com.aliyuncs.cloud_siem.transform.v20220616;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloud_siem.model.v20220616.DescribeAutomateResponseConfigFeatureResponse;
import com.aliyuncs.cloud_siem.model.v20220616.DescribeAutomateResponseConfigFeatureResponse.DataItem;
import com.aliyuncs.cloud_siem.model.v20220616.DescribeAutomateResponseConfigFeatureResponse.DataItem.RightValueEnum;
import com.aliyuncs.cloud_siem.model.v20220616.DescribeAutomateResponseConfigFeatureResponse.DataItem.SupportOperator;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAutomateResponseConfigFeatureResponseUnmarshaller {

	public static DescribeAutomateResponseConfigFeatureResponse unmarshall(DescribeAutomateResponseConfigFeatureResponse describeAutomateResponseConfigFeatureResponse, UnmarshallerContext _ctx) {
		
		describeAutomateResponseConfigFeatureResponse.setRequestId(_ctx.stringValue("DescribeAutomateResponseConfigFeatureResponse.RequestId"));
		describeAutomateResponseConfigFeatureResponse.setSuccess(_ctx.booleanValue("DescribeAutomateResponseConfigFeatureResponse.Success"));
		describeAutomateResponseConfigFeatureResponse.setCode(_ctx.integerValue("DescribeAutomateResponseConfigFeatureResponse.Code"));
		describeAutomateResponseConfigFeatureResponse.setMessage(_ctx.stringValue("DescribeAutomateResponseConfigFeatureResponse.Message"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAutomateResponseConfigFeatureResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setFeature(_ctx.stringValue("DescribeAutomateResponseConfigFeatureResponse.Data["+ i +"].Feature"));
			dataItem.setDataType(_ctx.stringValue("DescribeAutomateResponseConfigFeatureResponse.Data["+ i +"].DataType"));

			List<SupportOperator> supportOperators = new ArrayList<SupportOperator>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAutomateResponseConfigFeatureResponse.Data["+ i +"].SupportOperators.Length"); j++) {
				SupportOperator supportOperator = new SupportOperator();
				supportOperator.setHasRightValue(_ctx.booleanValue("DescribeAutomateResponseConfigFeatureResponse.Data["+ i +"].SupportOperators["+ j +"].HasRightValue"));
				supportOperator.setOperator(_ctx.stringValue("DescribeAutomateResponseConfigFeatureResponse.Data["+ i +"].SupportOperators["+ j +"].Operator"));
				supportOperator.setOperatorName(_ctx.stringValue("DescribeAutomateResponseConfigFeatureResponse.Data["+ i +"].SupportOperators["+ j +"].OperatorName"));
				supportOperator.setOperatorDescCn(_ctx.stringValue("DescribeAutomateResponseConfigFeatureResponse.Data["+ i +"].SupportOperators["+ j +"].OperatorDescCn"));
				supportOperator.setOperatorDescEn(_ctx.stringValue("DescribeAutomateResponseConfigFeatureResponse.Data["+ i +"].SupportOperators["+ j +"].OperatorDescEn"));
				supportOperator.setSupportDataType(_ctx.stringValue("DescribeAutomateResponseConfigFeatureResponse.Data["+ i +"].SupportOperators["+ j +"].SupportDataType"));
				supportOperator.setIndex(_ctx.integerValue("DescribeAutomateResponseConfigFeatureResponse.Data["+ i +"].SupportOperators["+ j +"].Index"));

				List<String> supportTag = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DescribeAutomateResponseConfigFeatureResponse.Data["+ i +"].SupportOperators["+ j +"].SupportTag.Length"); k++) {
					supportTag.add(_ctx.stringValue("DescribeAutomateResponseConfigFeatureResponse.Data["+ i +"].SupportOperators["+ j +"].SupportTag["+ k +"]"));
				}
				supportOperator.setSupportTag(supportTag);

				supportOperators.add(supportOperator);
			}
			dataItem.setSupportOperators(supportOperators);

			List<RightValueEnum> rightValueEnums = new ArrayList<RightValueEnum>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAutomateResponseConfigFeatureResponse.Data["+ i +"].RightValueEnums.Length"); j++) {
				RightValueEnum rightValueEnum = new RightValueEnum();
				rightValueEnum.setValue(_ctx.stringValue("DescribeAutomateResponseConfigFeatureResponse.Data["+ i +"].RightValueEnums["+ j +"].Value"));
				rightValueEnum.setValueMds(_ctx.stringValue("DescribeAutomateResponseConfigFeatureResponse.Data["+ i +"].RightValueEnums["+ j +"].ValueMds"));

				rightValueEnums.add(rightValueEnum);
			}
			dataItem.setRightValueEnums(rightValueEnums);

			data.add(dataItem);
		}
		describeAutomateResponseConfigFeatureResponse.setData(data);
	 
	 	return describeAutomateResponseConfigFeatureResponse;
	}
}