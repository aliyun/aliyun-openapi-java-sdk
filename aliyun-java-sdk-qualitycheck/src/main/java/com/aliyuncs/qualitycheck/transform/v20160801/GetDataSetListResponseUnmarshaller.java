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

package com.aliyuncs.qualitycheck.transform.v20160801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.qualitycheck.model.v20160801.GetDataSetListResponse;
import com.aliyuncs.qualitycheck.model.v20160801.GetDataSetListResponse.DataSet;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDataSetListResponseUnmarshaller {

	public static GetDataSetListResponse unmarshall(GetDataSetListResponse getDataSetListResponse, UnmarshallerContext context) {
		
		getDataSetListResponse.setRequestId(context.stringValue("GetDataSetListResponse.requestId"));
		getDataSetListResponse.setSuccess(context.booleanValue("GetDataSetListResponse.success"));
		getDataSetListResponse.setCode(context.stringValue("GetDataSetListResponse.code"));
		getDataSetListResponse.setMessage(context.stringValue("GetDataSetListResponse.message"));
		getDataSetListResponse.setCount(context.integerValue("GetDataSetListResponse.count"));

		List<DataSet> data = new ArrayList<DataSet>();
		for (int i = 0; i < context.lengthValue("GetDataSetListResponse.data.Length"); i++) {
			DataSet dataSet = new DataSet();
			dataSet.setSetId(context.longValue("GetDataSetListResponse.data["+ i +"].setId"));
			dataSet.setSetName(context.stringValue("GetDataSetListResponse.data["+ i +"].setName"));
			dataSet.setSetDomain(context.stringValue("GetDataSetListResponse.data["+ i +"].setDomain"));
			dataSet.setSetRoleArn(context.stringValue("GetDataSetListResponse.data["+ i +"].setRoleArn"));
			dataSet.setSetBucketName(context.stringValue("GetDataSetListResponse.data["+ i +"].setBucketName"));
			dataSet.setSetFolderName(context.stringValue("GetDataSetListResponse.data["+ i +"].setFolderName"));
			dataSet.setChannelType(context.integerValue("GetDataSetListResponse.data["+ i +"].channelType"));
			dataSet.setCreateType(context.integerValue("GetDataSetListResponse.data["+ i +"].createType"));

			data.add(dataSet);
		}
		getDataSetListResponse.setData(data);
	 
	 	return getDataSetListResponse;
	}
}