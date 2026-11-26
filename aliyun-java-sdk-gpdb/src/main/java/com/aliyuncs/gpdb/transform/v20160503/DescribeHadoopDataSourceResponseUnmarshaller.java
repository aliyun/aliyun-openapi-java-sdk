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

package com.aliyuncs.gpdb.transform.v20160503;

import com.aliyuncs.gpdb.model.v20160503.DescribeHadoopDataSourceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeHadoopDataSourceResponseUnmarshaller {

	public static DescribeHadoopDataSourceResponse unmarshall(DescribeHadoopDataSourceResponse describeHadoopDataSourceResponse, UnmarshallerContext _ctx) {
		
		describeHadoopDataSourceResponse.setRequestId(_ctx.stringValue("DescribeHadoopDataSourceResponse.RequestId"));
		describeHadoopDataSourceResponse.setDataSourceDir(_ctx.stringValue("DescribeHadoopDataSourceResponse.DataSourceDir"));
		describeHadoopDataSourceResponse.setModifyTime(_ctx.stringValue("DescribeHadoopDataSourceResponse.ModifyTime"));
		describeHadoopDataSourceResponse.setHadoopCreateType(_ctx.stringValue("DescribeHadoopDataSourceResponse.HadoopCreateType"));
		describeHadoopDataSourceResponse.setCreateTime(_ctx.stringValue("DescribeHadoopDataSourceResponse.CreateTime"));
		describeHadoopDataSourceResponse.setExternalDataServiceId(_ctx.stringValue("DescribeHadoopDataSourceResponse.ExternalDataServiceId"));
		describeHadoopDataSourceResponse.setHDFSConf(_ctx.stringValue("DescribeHadoopDataSourceResponse.HDFSConf"));
		describeHadoopDataSourceResponse.setStatusMessage(_ctx.stringValue("DescribeHadoopDataSourceResponse.StatusMessage"));
		describeHadoopDataSourceResponse.setYarnConf(_ctx.stringValue("DescribeHadoopDataSourceResponse.YarnConf"));
		describeHadoopDataSourceResponse.setDataSourceName(_ctx.stringValue("DescribeHadoopDataSourceResponse.DataSourceName"));
		describeHadoopDataSourceResponse.setDataSourceType(_ctx.stringValue("DescribeHadoopDataSourceResponse.DataSourceType"));
		describeHadoopDataSourceResponse.setDataSourceStatus(_ctx.stringValue("DescribeHadoopDataSourceResponse.DataSourceStatus"));
		describeHadoopDataSourceResponse.setHadoopHostsAddress(_ctx.stringValue("DescribeHadoopDataSourceResponse.HadoopHostsAddress"));
		describeHadoopDataSourceResponse.setHiveConf(_ctx.stringValue("DescribeHadoopDataSourceResponse.HiveConf"));
		describeHadoopDataSourceResponse.setDataSourceDescription(_ctx.stringValue("DescribeHadoopDataSourceResponse.DataSourceDescription"));
		describeHadoopDataSourceResponse.setEmrInstanceId(_ctx.stringValue("DescribeHadoopDataSourceResponse.EmrInstanceId"));
		describeHadoopDataSourceResponse.setMapReduceConf(_ctx.stringValue("DescribeHadoopDataSourceResponse.MapReduceConf"));
		describeHadoopDataSourceResponse.setDataSourceId(_ctx.stringValue("DescribeHadoopDataSourceResponse.DataSourceId"));
		describeHadoopDataSourceResponse.setHadoopCoreConf(_ctx.stringValue("DescribeHadoopDataSourceResponse.HadoopCoreConf"));
	 
	 	return describeHadoopDataSourceResponse;
	}
}