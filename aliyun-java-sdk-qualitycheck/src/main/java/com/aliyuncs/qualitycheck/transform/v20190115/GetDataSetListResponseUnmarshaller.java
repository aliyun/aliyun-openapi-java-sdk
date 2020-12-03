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

	public static GetDataSetListResponse unmarshall(GetDataSetListResponse getDataSetListResponse, UnmarshallerContext _ctx) {
		
		getDataSetListResponse.setRequestId(_ctx.stringValue("GetDataSetListResponse.RequestId"));
		getDataSetListResponse.setSuccess(_ctx.booleanValue("GetDataSetListResponse.Success"));
		getDataSetListResponse.setCode(_ctx.stringValue("GetDataSetListResponse.Code"));
		getDataSetListResponse.setMessage(_ctx.stringValue("GetDataSetListResponse.Message"));
		getDataSetListResponse.setCount(_ctx.integerValue("GetDataSetListResponse.Count"));

		List<DataSet> data = new ArrayList<DataSet>();
		for (int i = 0; i < _ctx.lengthValue("GetDataSetListResponse.Data.Length"); i++) {
			DataSet dataSet = new DataSet();
			dataSet.setSetId(_ctx.longValue("GetDataSetListResponse.Data["+ i +"].SetId"));
			dataSet.setSetName(_ctx.stringValue("GetDataSetListResponse.Data["+ i +"].SetName"));
			dataSet.setSetDomain(_ctx.stringValue("GetDataSetListResponse.Data["+ i +"].SetDomain"));
			dataSet.setSetRoleArn(_ctx.stringValue("GetDataSetListResponse.Data["+ i +"].SetRoleArn"));
			dataSet.setSetBucketName(_ctx.stringValue("GetDataSetListResponse.Data["+ i +"].SetBucketName"));
			dataSet.setSetFolderName(_ctx.stringValue("GetDataSetListResponse.Data["+ i +"].SetFolderName"));
			dataSet.setChannelType(_ctx.integerValue("GetDataSetListResponse.Data["+ i +"].ChannelType"));
			dataSet.setCreateType(_ctx.integerValue("GetDataSetListResponse.Data["+ i +"].CreateType"));
			dataSet.setCreateTime(_ctx.stringValue("GetDataSetListResponse.Data["+ i +"].CreateTime"));
			dataSet.setUpdateTime(_ctx.stringValue("GetDataSetListResponse.Data["+ i +"].UpdateTime"));
			dataSet.setSetNumber(_ctx.integerValue("GetDataSetListResponse.Data["+ i +"].SetNumber"));

			data.add(dataSet);
		}
		getDataSetListResponse.setData(data);
	 
	 	return getDataSetListResponse;
	}
}