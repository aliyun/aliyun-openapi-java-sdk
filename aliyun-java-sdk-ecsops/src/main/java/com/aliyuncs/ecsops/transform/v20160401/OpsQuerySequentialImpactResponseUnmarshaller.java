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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsQuerySequentialImpactResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsQuerySequentialImpactResponse.SeqItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsQuerySequentialImpactResponseUnmarshaller {

	public static OpsQuerySequentialImpactResponse unmarshall(OpsQuerySequentialImpactResponse opsQuerySequentialImpactResponse, UnmarshallerContext _ctx) {
		
		opsQuerySequentialImpactResponse.setRequestId(_ctx.stringValue("OpsQuerySequentialImpactResponse.RequestId"));

		List<SeqItem> seqItems = new ArrayList<SeqItem>();
		for (int i = 0; i < _ctx.lengthValue("OpsQuerySequentialImpactResponse.SeqItems.Length"); i++) {
			SeqItem seqItem = new SeqItem();
			seqItem.setDataCnt(_ctx.integerValue("OpsQuerySequentialImpactResponse.SeqItems["+ i +"].DataCnt"));
			seqItem.setDataValid(_ctx.booleanValue("OpsQuerySequentialImpactResponse.SeqItems["+ i +"].DataValid"));
			seqItem.setDefaultResultFormat(_ctx.booleanValue("OpsQuerySequentialImpactResponse.SeqItems["+ i +"].DefaultResultFormat"));
			seqItem.setEndTime(_ctx.stringValue("OpsQuerySequentialImpactResponse.SeqItems["+ i +"].EndTime"));
			seqItem.setStartTime(_ctx.stringValue("OpsQuerySequentialImpactResponse.SeqItems["+ i +"].StartTime"));
			seqItem.setTargetExceptionName(_ctx.stringValue("OpsQuerySequentialImpactResponse.SeqItems["+ i +"].TargetExceptionName"));
			seqItem.setInterval(_ctx.integerValue("OpsQuerySequentialImpactResponse.SeqItems["+ i +"].Interval"));

			List<String> userCnts = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsQuerySequentialImpactResponse.SeqItems["+ i +"].UserCnts.Length"); j++) {
				userCnts.add(_ctx.stringValue("OpsQuerySequentialImpactResponse.SeqItems["+ i +"].UserCnts["+ j +"]"));
			}
			seqItem.setUserCnts(userCnts);

			List<String> gc2Cnts = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsQuerySequentialImpactResponse.SeqItems["+ i +"].Gc2Cnts.Length"); j++) {
				gc2Cnts.add(_ctx.stringValue("OpsQuerySequentialImpactResponse.SeqItems["+ i +"].Gc2Cnts["+ j +"]"));
			}
			seqItem.setGc2Cnts(gc2Cnts);

			List<String> gocVcpuCnts = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsQuerySequentialImpactResponse.SeqItems["+ i +"].GocVcpuCnts.Length"); j++) {
				gocVcpuCnts.add(_ctx.stringValue("OpsQuerySequentialImpactResponse.SeqItems["+ i +"].GocVcpuCnts["+ j +"]"));
			}
			seqItem.setGocVcpuCnts(gocVcpuCnts);

			List<String> gc1Cnts = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsQuerySequentialImpactResponse.SeqItems["+ i +"].Gc1Cnts.Length"); j++) {
				gc1Cnts.add(_ctx.stringValue("OpsQuerySequentialImpactResponse.SeqItems["+ i +"].Gc1Cnts["+ j +"]"));
			}
			seqItem.setGc1Cnts(gc1Cnts);

			List<String> realVcpuCnts = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsQuerySequentialImpactResponse.SeqItems["+ i +"].RealVcpuCnts.Length"); j++) {
				realVcpuCnts.add(_ctx.stringValue("OpsQuerySequentialImpactResponse.SeqItems["+ i +"].RealVcpuCnts["+ j +"]"));
			}
			seqItem.setRealVcpuCnts(realVcpuCnts);

			List<String> gc3Cnts = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsQuerySequentialImpactResponse.SeqItems["+ i +"].Gc3Cnts.Length"); j++) {
				gc3Cnts.add(_ctx.stringValue("OpsQuerySequentialImpactResponse.SeqItems["+ i +"].Gc3Cnts["+ j +"]"));
			}
			seqItem.setGc3Cnts(gc3Cnts);

			List<String> gc5Cnts = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsQuerySequentialImpactResponse.SeqItems["+ i +"].Gc5Cnts.Length"); j++) {
				gc5Cnts.add(_ctx.stringValue("OpsQuerySequentialImpactResponse.SeqItems["+ i +"].Gc5Cnts["+ j +"]"));
			}
			seqItem.setGc5Cnts(gc5Cnts);

			List<String> gc4Cnts = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsQuerySequentialImpactResponse.SeqItems["+ i +"].Gc4Cnts.Length"); j++) {
				gc4Cnts.add(_ctx.stringValue("OpsQuerySequentialImpactResponse.SeqItems["+ i +"].Gc4Cnts["+ j +"]"));
			}
			seqItem.setGc4Cnts(gc4Cnts);

			List<String> gc0Cnts = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsQuerySequentialImpactResponse.SeqItems["+ i +"].Gc0Cnts.Length"); j++) {
				gc0Cnts.add(_ctx.stringValue("OpsQuerySequentialImpactResponse.SeqItems["+ i +"].Gc0Cnts["+ j +"]"));
			}
			seqItem.setGc0Cnts(gc0Cnts);

			List<String> timeLines = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsQuerySequentialImpactResponse.SeqItems["+ i +"].TimeLines.Length"); j++) {
				timeLines.add(_ctx.stringValue("OpsQuerySequentialImpactResponse.SeqItems["+ i +"].TimeLines["+ j +"]"));
			}
			seqItem.setTimeLines(timeLines);

			List<String> vmCnts = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsQuerySequentialImpactResponse.SeqItems["+ i +"].VmCnts.Length"); j++) {
				vmCnts.add(_ctx.stringValue("OpsQuerySequentialImpactResponse.SeqItems["+ i +"].VmCnts["+ j +"]"));
			}
			seqItem.setVmCnts(vmCnts);

			List<String> gc6Cnts = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsQuerySequentialImpactResponse.SeqItems["+ i +"].Gc6Cnts.Length"); j++) {
				gc6Cnts.add(_ctx.stringValue("OpsQuerySequentialImpactResponse.SeqItems["+ i +"].Gc6Cnts["+ j +"]"));
			}
			seqItem.setGc6Cnts(gc6Cnts);

			List<String> gc7Cnts = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsQuerySequentialImpactResponse.SeqItems["+ i +"].Gc7Cnts.Length"); j++) {
				gc7Cnts.add(_ctx.stringValue("OpsQuerySequentialImpactResponse.SeqItems["+ i +"].Gc7Cnts["+ j +"]"));
			}
			seqItem.setGc7Cnts(gc7Cnts);

			seqItems.add(seqItem);
		}
		opsQuerySequentialImpactResponse.setSeqItems(seqItems);
	 
	 	return opsQuerySequentialImpactResponse;
	}
}