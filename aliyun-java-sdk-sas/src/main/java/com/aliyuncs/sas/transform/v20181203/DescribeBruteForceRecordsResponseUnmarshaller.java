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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.DescribeBruteForceRecordsResponse;
import com.aliyuncs.sas.model.v20181203.DescribeBruteForceRecordsResponse.BruteForceRecord;
import com.aliyuncs.sas.model.v20181203.DescribeBruteForceRecordsResponse.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBruteForceRecordsResponseUnmarshaller {

	public static DescribeBruteForceRecordsResponse unmarshall(DescribeBruteForceRecordsResponse describeBruteForceRecordsResponse, UnmarshallerContext _ctx) {
		
		describeBruteForceRecordsResponse.setRequestId(_ctx.stringValue("DescribeBruteForceRecordsResponse.RequestId"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("DescribeBruteForceRecordsResponse.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("DescribeBruteForceRecordsResponse.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.integerValue("DescribeBruteForceRecordsResponse.PageInfo.TotalCount"));
		pageInfo.setCount(_ctx.integerValue("DescribeBruteForceRecordsResponse.PageInfo.Count"));
		describeBruteForceRecordsResponse.setPageInfo(pageInfo);

		List<BruteForceRecord> machineList = new ArrayList<BruteForceRecord>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBruteForceRecordsResponse.MachineList.Length"); i++) {
			BruteForceRecord bruteForceRecord = new BruteForceRecord();
			bruteForceRecord.setStatus(_ctx.integerValue("DescribeBruteForceRecordsResponse.MachineList["+ i +"].Status"));
			bruteForceRecord.setBlockExpireDate(_ctx.longValue("DescribeBruteForceRecordsResponse.MachineList["+ i +"].BlockExpireDate"));
			bruteForceRecord.setUuid(_ctx.stringValue("DescribeBruteForceRecordsResponse.MachineList["+ i +"].Uuid"));
			bruteForceRecord.setInternetIp(_ctx.stringValue("DescribeBruteForceRecordsResponse.MachineList["+ i +"].InternetIp"));
			bruteForceRecord.setInstanceName(_ctx.stringValue("DescribeBruteForceRecordsResponse.MachineList["+ i +"].InstanceName"));
			bruteForceRecord.setBlockIp(_ctx.stringValue("DescribeBruteForceRecordsResponse.MachineList["+ i +"].BlockIp"));
			bruteForceRecord.setPort(_ctx.stringValue("DescribeBruteForceRecordsResponse.MachineList["+ i +"].Port"));
			bruteForceRecord.setSource(_ctx.stringValue("DescribeBruteForceRecordsResponse.MachineList["+ i +"].Source"));
			bruteForceRecord.setIntranetIp(_ctx.stringValue("DescribeBruteForceRecordsResponse.MachineList["+ i +"].IntranetIp"));
			bruteForceRecord.setId(_ctx.longValue("DescribeBruteForceRecordsResponse.MachineList["+ i +"].Id"));
			bruteForceRecord.setRuleName(_ctx.stringValue("DescribeBruteForceRecordsResponse.MachineList["+ i +"].RuleName"));
			bruteForceRecord.setErrorCode(_ctx.stringValue("DescribeBruteForceRecordsResponse.MachineList["+ i +"].ErrorCode"));
			bruteForceRecord.setSuccessInfo(_ctx.stringValue("DescribeBruteForceRecordsResponse.MachineList["+ i +"].successInfo"));
			bruteForceRecord.setBlockType(_ctx.stringValue("DescribeBruteForceRecordsResponse.MachineList["+ i +"].BlockType"));
			bruteForceRecord.setAliNetOnline(_ctx.booleanValue("DescribeBruteForceRecordsResponse.MachineList["+ i +"].AliNetOnline"));

			machineList.add(bruteForceRecord);
		}
		describeBruteForceRecordsResponse.setMachineList(machineList);
	 
	 	return describeBruteForceRecordsResponse;
	}
}