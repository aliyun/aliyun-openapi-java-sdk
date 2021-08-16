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

package com.aliyuncs.das.transform.v20200116;

import com.aliyuncs.das.model.v20200116.DescribeCloudbenchTaskConfigResponse;
import com.aliyuncs.das.model.v20200116.DescribeCloudbenchTaskConfigResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCloudbenchTaskConfigResponseUnmarshaller {

	public static DescribeCloudbenchTaskConfigResponse unmarshall(DescribeCloudbenchTaskConfigResponse describeCloudbenchTaskConfigResponse, UnmarshallerContext _ctx) {
		
		describeCloudbenchTaskConfigResponse.setRequestId(_ctx.stringValue("DescribeCloudbenchTaskConfigResponse.RequestId"));
		describeCloudbenchTaskConfigResponse.setCode(_ctx.stringValue("DescribeCloudbenchTaskConfigResponse.Code"));
		describeCloudbenchTaskConfigResponse.setMessage(_ctx.stringValue("DescribeCloudbenchTaskConfigResponse.Message"));
		describeCloudbenchTaskConfigResponse.setSuccess(_ctx.stringValue("DescribeCloudbenchTaskConfigResponse.Success"));

		Data data = new Data();
		data.setWorkDir(_ctx.stringValue("DescribeCloudbenchTaskConfigResponse.Data.WorkDir"));
		data.setArchiveFolder(_ctx.stringValue("DescribeCloudbenchTaskConfigResponse.Data.ArchiveFolder"));
		data.setMetaFilePath(_ctx.stringValue("DescribeCloudbenchTaskConfigResponse.Data.MetaFilePath"));
		data.setMetaFileName(_ctx.stringValue("DescribeCloudbenchTaskConfigResponse.Data.MetaFileName"));
		data.setMetaFileOnOss(_ctx.stringValue("DescribeCloudbenchTaskConfigResponse.Data.MetaFileOnOss"));
		data.setUserId(_ctx.stringValue("DescribeCloudbenchTaskConfigResponse.Data.UserId"));
		data.setBenchCmd(_ctx.stringValue("DescribeCloudbenchTaskConfigResponse.Data.BenchCmd"));
		data.setSqlFileOnOss(_ctx.stringValue("DescribeCloudbenchTaskConfigResponse.Data.SqlFileOnOss"));
		data.setLoadCmd(_ctx.stringValue("DescribeCloudbenchTaskConfigResponse.Data.LoadCmd"));
		data.setRocksDbPath(_ctx.stringValue("DescribeCloudbenchTaskConfigResponse.Data.RocksDbPath"));
		data.setParseCmd(_ctx.stringValue("DescribeCloudbenchTaskConfigResponse.Data.ParseCmd"));
		data.setSqlFileName(_ctx.stringValue("DescribeCloudbenchTaskConfigResponse.Data.SqlFileName"));
		data.setClientJarPath(_ctx.stringValue("DescribeCloudbenchTaskConfigResponse.Data.ClientJarPath"));
		data.setSqlFilePath(_ctx.stringValue("DescribeCloudbenchTaskConfigResponse.Data.SqlFilePath"));
		data.setParseFilePath(_ctx.stringValue("DescribeCloudbenchTaskConfigResponse.Data.ParseFilePath"));
		data.setJarOnOss(_ctx.stringValue("DescribeCloudbenchTaskConfigResponse.Data.JarOnOss"));
		data.setTaskId(_ctx.stringValue("DescribeCloudbenchTaskConfigResponse.Data.TaskId"));
		describeCloudbenchTaskConfigResponse.setData(data);
	 
	 	return describeCloudbenchTaskConfigResponse;
	}
}