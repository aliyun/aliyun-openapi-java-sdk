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

package com.aliyuncs.qualitycheck.transform.v20190115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.qualitycheck.model.v20190115.GetDataSetListResponse;
import com.aliyuncs.qualitycheck.model.v20190115.GetDataSetListResponse.DataSet;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDataSetListResponseUnmarshaller {

	public static GetDataSetListResponse unmarshall(GetDataSetListResponse getDataSetListResponse, UnmarshallerContext context) {
		
		getDataSetListResponse.setRequestId(context.stringValue("GetDataSetListResponse.RequestId"));
		getDataSetListResponse.setSuccess(context.booleanValue("GetDataSetListResponse.Success"));
		getDataSetListResponse.setCode(context.stringValue("GetDataSetListResponse.Code"));
		getDataSetListResponse.setMessage(context.stringValue("GetDataSetListResponse.Message"));
		getDataSetListResponse.setCount(context.integerValue("GetDataSetListResponse.Count"));

		List<DataSet> data = new ArrayList<DataSet>();
		for (int i = 0; i < context.lengthValue("GetDataSetListResponse.Data.Length"); i++) {
			DataSet dataSet = new DataSet();
			dataSet.setSetId(context.longValue("GetDataSetListResponse.Data["+ i +"].SetId"));
			dataSet.setSetName(context.stringValue("GetDataSetListResponse.Data["+ i +"].SetName"));
			dataSet.setSetDomain(context.stringValue("GetDataSetListResponse.Data["+ i +"].SetDomain"));
			dataSet.setSetRoleArn(context.stringValue("GetDataSetListResponse.Data["+ i +"].SetRoleArn"));
			dataSet.setSetBucketName(context.stringValue("GetDataSetListResponse.Data["+ i +"].SetBucketName"));
			dataSet.setSetFolderName(context.stringValue("GetDataSetListResponse.Data["+ i +"].SetFolderName"));
			dataSet.setChannelType(context.integerValue("GetDataSetListResponse.Data["+ i +"].ChannelType"));
			dataSet.setCreateType(context.integerValue("GetDataSetListResponse.Data["+ i +"].CreateType"));

			data.add(dataSet);
		}
		getDataSetListResponse.setData(data);
	 
	 	return getDataSetListResponse;
	}
}