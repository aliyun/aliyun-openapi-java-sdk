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

package com.aliyuncs.aegis.transform.v20161111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aegis.model.v20161111.DescribeMetaDataResponse;
import com.aliyuncs.aegis.model.v20161111.DescribeMetaDataResponse.MetaData;
import com.aliyuncs.aegis.model.v20161111.DescribeMetaDataResponse.MetaData.DatasourceField;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMetaDataResponseUnmarshaller {

	public static DescribeMetaDataResponse unmarshall(DescribeMetaDataResponse describeMetaDataResponse, UnmarshallerContext context) {
		
		describeMetaDataResponse.setRequestId(context.stringValue("DescribeMetaDataResponse.RequestId"));

		MetaData metaData = new MetaData();
		metaData.setLogStoreName(context.stringValue("DescribeMetaDataResponse.MetaData.LogStoreName"));
		metaData.setProjectName(context.stringValue("DescribeMetaDataResponse.MetaData.ProjectName"));
		metaData.setStatus(context.integerValue("DescribeMetaDataResponse.MetaData.Status"));

		List<DatasourceField> datasourceFieldList = new ArrayList<DatasourceField>();
		for (int i = 0; i < context.lengthValue("DescribeMetaDataResponse.MetaData.DatasourceFieldList.Length"); i++) {
			DatasourceField datasourceField = new DatasourceField();
			datasourceField.setFieldName(context.stringValue("DescribeMetaDataResponse.MetaData.DatasourceFieldList["+ i +"].FieldName"));
			datasourceField.setValueType(context.stringValue("DescribeMetaDataResponse.MetaData.DatasourceFieldList["+ i +"].ValueType"));
			datasourceField.setFieldDescription(context.stringValue("DescribeMetaDataResponse.MetaData.DatasourceFieldList["+ i +"].FieldDescription"));
			datasourceField.setFieldAliasName(context.stringValue("DescribeMetaDataResponse.MetaData.DatasourceFieldList["+ i +"].FieldAliasName"));
			datasourceField.setFieldType(context.stringValue("DescribeMetaDataResponse.MetaData.DatasourceFieldList["+ i +"].FieldType"));
			datasourceField.setFieldValue(context.stringValue("DescribeMetaDataResponse.MetaData.DatasourceFieldList["+ i +"].FieldValue"));
			datasourceField.setIsIdentification(context.integerValue("DescribeMetaDataResponse.MetaData.DatasourceFieldList["+ i +"].IsIdentification"));

			datasourceFieldList.add(datasourceField);
		}
		metaData.setDatasourceFieldList(datasourceFieldList);
		describeMetaDataResponse.setMetaData(metaData);
	 
	 	return describeMetaDataResponse;
	}
}