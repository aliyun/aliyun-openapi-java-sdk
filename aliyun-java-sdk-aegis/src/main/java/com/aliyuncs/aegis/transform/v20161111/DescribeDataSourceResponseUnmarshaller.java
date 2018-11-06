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

import com.aliyuncs.aegis.model.v20161111.DescribeDataSourceResponse;
import com.aliyuncs.aegis.model.v20161111.DescribeDataSourceResponse.Data;
import com.aliyuncs.aegis.model.v20161111.DescribeDataSourceResponse.Data.MetaDataField;
import com.aliyuncs.aegis.model.v20161111.DescribeDataSourceResponse.Data.MetaDataField.Operator;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDataSourceResponseUnmarshaller {

	public static DescribeDataSourceResponse unmarshall(DescribeDataSourceResponse describeDataSourceResponse, UnmarshallerContext context) {
		
		describeDataSourceResponse.setRequestId(context.stringValue("DescribeDataSourceResponse.RequestId"));
		describeDataSourceResponse.setSuccess(context.booleanValue("DescribeDataSourceResponse.Success"));
		describeDataSourceResponse.setCount(context.integerValue("DescribeDataSourceResponse.Count"));

		List<Data> metaDatas = new ArrayList<Data>();
		for (int i = 0; i < context.lengthValue("DescribeDataSourceResponse.MetaDatas.Length"); i++) {
			Data data = new Data();
			data.setDataSourceId(context.integerValue("DescribeDataSourceResponse.MetaDatas["+ i +"].DataSourceId"));
			data.setDateSourceName(context.stringValue("DescribeDataSourceResponse.MetaDatas["+ i +"].DateSourceName"));
			data.setDescription(context.stringValue("DescribeDataSourceResponse.MetaDatas["+ i +"].Description"));

			List<MetaDataField> metaDataFields = new ArrayList<MetaDataField>();
			for (int j = 0; j < context.lengthValue("DescribeDataSourceResponse.MetaDatas["+ i +"].MetaDataFields.Length"); j++) {
				MetaDataField metaDataField = new MetaDataField();
				metaDataField.setFiledName(context.stringValue("DescribeDataSourceResponse.MetaDatas["+ i +"].MetaDataFields["+ j +"].FiledName"));
				metaDataField.setFiled(context.stringValue("DescribeDataSourceResponse.MetaDatas["+ i +"].MetaDataFields["+ j +"].Filed"));
				metaDataField.setValueType(context.stringValue("DescribeDataSourceResponse.MetaDatas["+ i +"].MetaDataFields["+ j +"].ValueType"));
				metaDataField.setSample(context.stringValue("DescribeDataSourceResponse.MetaDatas["+ i +"].MetaDataFields["+ j +"].Sample"));

				List<Operator> operatorList = new ArrayList<Operator>();
				for (int k = 0; k < context.lengthValue("DescribeDataSourceResponse.MetaDatas["+ i +"].MetaDataFields["+ j +"].OperatorList.Length"); k++) {
					Operator operator = new Operator();
					operator.setName(context.stringValue("DescribeDataSourceResponse.MetaDatas["+ i +"].MetaDataFields["+ j +"].OperatorList["+ k +"].Name"));
					operator.setDescription(context.stringValue("DescribeDataSourceResponse.MetaDatas["+ i +"].MetaDataFields["+ j +"].OperatorList["+ k +"].Description"));

					operatorList.add(operator);
				}
				metaDataField.setOperatorList(operatorList);

				metaDataFields.add(metaDataField);
			}
			data.setMetaDataFields(metaDataFields);

			metaDatas.add(data);
		}
		describeDataSourceResponse.setMetaDatas(metaDatas);
	 
	 	return describeDataSourceResponse;
	}
}