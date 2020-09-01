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

package com.aliyuncs.drds.transform.v20190123;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.drds.model.v20190123.DescribeCustomDataExportSrcDstTablesResponse;
import com.aliyuncs.drds.model.v20190123.DescribeCustomDataExportSrcDstTablesResponse.DataExportSrcDstTables;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCustomDataExportSrcDstTablesResponseUnmarshaller {

	public static DescribeCustomDataExportSrcDstTablesResponse unmarshall(DescribeCustomDataExportSrcDstTablesResponse describeCustomDataExportSrcDstTablesResponse, UnmarshallerContext _ctx) {
		
		describeCustomDataExportSrcDstTablesResponse.setRequestId(_ctx.stringValue("DescribeCustomDataExportSrcDstTablesResponse.RequestId"));
		describeCustomDataExportSrcDstTablesResponse.setSuccess(_ctx.booleanValue("DescribeCustomDataExportSrcDstTablesResponse.Success"));

		DataExportSrcDstTables dataExportSrcDstTables = new DataExportSrcDstTables();

		List<String> srcTables = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCustomDataExportSrcDstTablesResponse.DataExportSrcDstTables.SrcTables.Length"); i++) {
			srcTables.add(_ctx.stringValue("DescribeCustomDataExportSrcDstTablesResponse.DataExportSrcDstTables.SrcTables["+ i +"]"));
		}
		dataExportSrcDstTables.setSrcTables(srcTables);

		List<String> dstTables = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCustomDataExportSrcDstTablesResponse.DataExportSrcDstTables.DstTables.Length"); i++) {
			dstTables.add(_ctx.stringValue("DescribeCustomDataExportSrcDstTablesResponse.DataExportSrcDstTables.DstTables["+ i +"]"));
		}
		dataExportSrcDstTables.setDstTables(dstTables);
		describeCustomDataExportSrcDstTablesResponse.setDataExportSrcDstTables(dataExportSrcDstTables);
	 
	 	return describeCustomDataExportSrcDstTablesResponse;
	}
}