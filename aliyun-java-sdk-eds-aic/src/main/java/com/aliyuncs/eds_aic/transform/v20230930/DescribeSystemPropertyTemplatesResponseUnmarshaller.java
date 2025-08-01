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

package com.aliyuncs.eds_aic.transform.v20230930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eds_aic.model.v20230930.DescribeSystemPropertyTemplatesResponse;
import com.aliyuncs.eds_aic.model.v20230930.DescribeSystemPropertyTemplatesResponse.Data;
import com.aliyuncs.eds_aic.model.v20230930.DescribeSystemPropertyTemplatesResponse.Data.SystemPropertyInfo;
import com.aliyuncs.eds_aic.model.v20230930.DescribeSystemPropertyTemplatesResponse.Data.SystemPropertyInfo.CustomPropertyInfosItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSystemPropertyTemplatesResponseUnmarshaller {

	public static DescribeSystemPropertyTemplatesResponse unmarshall(DescribeSystemPropertyTemplatesResponse describeSystemPropertyTemplatesResponse, UnmarshallerContext _ctx) {
		
		describeSystemPropertyTemplatesResponse.setRequestId(_ctx.stringValue("DescribeSystemPropertyTemplatesResponse.RequestId"));
		describeSystemPropertyTemplatesResponse.setNextToken(_ctx.stringValue("DescribeSystemPropertyTemplatesResponse.NextToken"));
		describeSystemPropertyTemplatesResponse.setTotalCount(_ctx.integerValue("DescribeSystemPropertyTemplatesResponse.TotalCount"));

		List<Data> systemPropertyTemplateModel = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSystemPropertyTemplatesResponse.SystemPropertyTemplateModel.Length"); i++) {
			Data data = new Data();
			data.setGmtCreate(_ctx.stringValue("DescribeSystemPropertyTemplatesResponse.SystemPropertyTemplateModel["+ i +"].GmtCreate"));
			data.setGmtModified(_ctx.stringValue("DescribeSystemPropertyTemplatesResponse.SystemPropertyTemplateModel["+ i +"].GmtModified"));
			data.setTemplateId(_ctx.stringValue("DescribeSystemPropertyTemplatesResponse.SystemPropertyTemplateModel["+ i +"].TemplateId"));
			data.setTemplateName(_ctx.stringValue("DescribeSystemPropertyTemplatesResponse.SystemPropertyTemplateModel["+ i +"].TemplateName"));
			data.setStatus(_ctx.stringValue("DescribeSystemPropertyTemplatesResponse.SystemPropertyTemplateModel["+ i +"].Status"));
			data.setFilePath(_ctx.stringValue("DescribeSystemPropertyTemplatesResponse.SystemPropertyTemplateModel["+ i +"].FilePath"));
			data.setEnableAuto(_ctx.booleanValue("DescribeSystemPropertyTemplatesResponse.SystemPropertyTemplateModel["+ i +"].EnableAuto"));

			SystemPropertyInfo systemPropertyInfo = new SystemPropertyInfo();
			systemPropertyInfo.setRoBuildFingerprint(_ctx.stringValue("DescribeSystemPropertyTemplatesResponse.SystemPropertyTemplateModel["+ i +"].SystemPropertyInfo.RoBuildFingerprint"));
			systemPropertyInfo.setRoProductModel(_ctx.stringValue("DescribeSystemPropertyTemplatesResponse.SystemPropertyTemplateModel["+ i +"].SystemPropertyInfo.RoProductModel"));
			systemPropertyInfo.setRoProductManufacturer(_ctx.stringValue("DescribeSystemPropertyTemplatesResponse.SystemPropertyTemplateModel["+ i +"].SystemPropertyInfo.RoProductManufacturer"));
			systemPropertyInfo.setRoProductBrand(_ctx.stringValue("DescribeSystemPropertyTemplatesResponse.SystemPropertyTemplateModel["+ i +"].SystemPropertyInfo.RoProductBrand"));
			systemPropertyInfo.setRoBuildUser(_ctx.stringValue("DescribeSystemPropertyTemplatesResponse.SystemPropertyTemplateModel["+ i +"].SystemPropertyInfo.RoBuildUser"));
			systemPropertyInfo.setRoBuildId(_ctx.stringValue("DescribeSystemPropertyTemplatesResponse.SystemPropertyTemplateModel["+ i +"].SystemPropertyInfo.RoBuildId"));
			systemPropertyInfo.setRoBootloader(_ctx.stringValue("DescribeSystemPropertyTemplatesResponse.SystemPropertyTemplateModel["+ i +"].SystemPropertyInfo.RoBootloader"));
			systemPropertyInfo.setRoBuildTags(_ctx.stringValue("DescribeSystemPropertyTemplatesResponse.SystemPropertyTemplateModel["+ i +"].SystemPropertyInfo.RoBuildTags"));
			systemPropertyInfo.setRoProductBoard(_ctx.stringValue("DescribeSystemPropertyTemplatesResponse.SystemPropertyTemplateModel["+ i +"].SystemPropertyInfo.RoProductBoard"));
			systemPropertyInfo.setRoProductDevice(_ctx.stringValue("DescribeSystemPropertyTemplatesResponse.SystemPropertyTemplateModel["+ i +"].SystemPropertyInfo.RoProductDevice"));
			systemPropertyInfo.setRoBuildProduct(_ctx.stringValue("DescribeSystemPropertyTemplatesResponse.SystemPropertyTemplateModel["+ i +"].SystemPropertyInfo.RoBuildProduct"));
			systemPropertyInfo.setRoBuildType(_ctx.stringValue("DescribeSystemPropertyTemplatesResponse.SystemPropertyTemplateModel["+ i +"].SystemPropertyInfo.RoBuildType"));
			systemPropertyInfo.setRoBuildHost(_ctx.stringValue("DescribeSystemPropertyTemplatesResponse.SystemPropertyTemplateModel["+ i +"].SystemPropertyInfo.RoBuildHost"));
			systemPropertyInfo.setRoBuildDisplayId(_ctx.stringValue("DescribeSystemPropertyTemplatesResponse.SystemPropertyTemplateModel["+ i +"].SystemPropertyInfo.RoBuildDisplayId"));
			systemPropertyInfo.setRwRoSerialNo(_ctx.stringValue("DescribeSystemPropertyTemplatesResponse.SystemPropertyTemplateModel["+ i +"].SystemPropertyInfo.RwRoSerialNo"));

			List<CustomPropertyInfosItem> customPropertyInfos = new ArrayList<CustomPropertyInfosItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeSystemPropertyTemplatesResponse.SystemPropertyTemplateModel["+ i +"].SystemPropertyInfo.CustomPropertyInfos.Length"); j++) {
				CustomPropertyInfosItem customPropertyInfosItem = new CustomPropertyInfosItem();
				customPropertyInfosItem.setPropertyName(_ctx.stringValue("DescribeSystemPropertyTemplatesResponse.SystemPropertyTemplateModel["+ i +"].SystemPropertyInfo.CustomPropertyInfos["+ j +"].PropertyName"));
				customPropertyInfosItem.setPropertyValue(_ctx.stringValue("DescribeSystemPropertyTemplatesResponse.SystemPropertyTemplateModel["+ i +"].SystemPropertyInfo.CustomPropertyInfos["+ j +"].PropertyValue"));

				customPropertyInfos.add(customPropertyInfosItem);
			}
			systemPropertyInfo.setCustomPropertyInfos(customPropertyInfos);
			data.setSystemPropertyInfo(systemPropertyInfo);

			systemPropertyTemplateModel.add(data);
		}
		describeSystemPropertyTemplatesResponse.setSystemPropertyTemplateModel(systemPropertyTemplateModel);
	 
	 	return describeSystemPropertyTemplatesResponse;
	}
}