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

package com.aliyuncs.mts.transform.v20140618;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mts.model.v20140618.ListFpShotNotaryResponse;
import com.aliyuncs.mts.model.v20140618.ListFpShotNotaryResponse.FpShotNotary;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFpShotNotaryResponseUnmarshaller {

	public static ListFpShotNotaryResponse unmarshall(ListFpShotNotaryResponse listFpShotNotaryResponse, UnmarshallerContext _ctx) {
		
		listFpShotNotaryResponse.setRequestId(_ctx.stringValue("ListFpShotNotaryResponse.RequestId"));
		listFpShotNotaryResponse.setNextPageToken(_ctx.stringValue("ListFpShotNotaryResponse.NextPageToken"));

		List<FpShotNotary> fpShotNotaryList = new ArrayList<FpShotNotary>();
		for (int i = 0; i < _ctx.lengthValue("ListFpShotNotaryResponse.FpShotNotaryList.Length"); i++) {
			FpShotNotary fpShotNotary = new FpShotNotary();
			fpShotNotary.setTransactionId(_ctx.stringValue("ListFpShotNotaryResponse.FpShotNotaryList["+ i +"].TransactionId"));
			fpShotNotary.setTxHash(_ctx.stringValue("ListFpShotNotaryResponse.FpShotNotaryList["+ i +"].TxHash"));
			fpShotNotary.setFpDBId(_ctx.stringValue("ListFpShotNotaryResponse.FpShotNotaryList["+ i +"].FpDBId"));
			fpShotNotary.setJobId(_ctx.stringValue("ListFpShotNotaryResponse.FpShotNotaryList["+ i +"].JobId"));
			fpShotNotary.setDetail(_ctx.stringValue("ListFpShotNotaryResponse.FpShotNotaryList["+ i +"].Detail"));
			fpShotNotary.setCreationTime(_ctx.stringValue("ListFpShotNotaryResponse.FpShotNotaryList["+ i +"].CreationTime"));
			fpShotNotary.setFinishTime(_ctx.stringValue("ListFpShotNotaryResponse.FpShotNotaryList["+ i +"].FinishTime"));

			fpShotNotaryList.add(fpShotNotary);
		}
		listFpShotNotaryResponse.setFpShotNotaryList(fpShotNotaryList);
	 
	 	return listFpShotNotaryResponse;
	}
}