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

package com.aliyuncs.alidns.transform.v20150109;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.alidns.model.v20150109.DescribeBatchResultDetailResponse;
import com.aliyuncs.alidns.model.v20150109.DescribeBatchResultDetailResponse.BatchResultDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBatchResultDetailResponseUnmarshaller {

	public static DescribeBatchResultDetailResponse unmarshall(DescribeBatchResultDetailResponse describeBatchResultDetailResponse, UnmarshallerContext _ctx) {
		
		describeBatchResultDetailResponse.setRequestId(_ctx.stringValue("DescribeBatchResultDetailResponse.RequestId"));
		describeBatchResultDetailResponse.setTotalCount(_ctx.longValue("DescribeBatchResultDetailResponse.TotalCount"));
		describeBatchResultDetailResponse.setPageNumber(_ctx.longValue("DescribeBatchResultDetailResponse.PageNumber"));
		describeBatchResultDetailResponse.setPageSize(_ctx.longValue("DescribeBatchResultDetailResponse.PageSize"));

		List<BatchResultDetail> batchResultDetails = new ArrayList<BatchResultDetail>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBatchResultDetailResponse.BatchResultDetails.Length"); i++) {
			BatchResultDetail batchResultDetail = new BatchResultDetail();
			batchResultDetail.setDomain(_ctx.stringValue("DescribeBatchResultDetailResponse.BatchResultDetails["+ i +"].Domain"));
			batchResultDetail.setType(_ctx.stringValue("DescribeBatchResultDetailResponse.BatchResultDetails["+ i +"].Type"));
			batchResultDetail.setRr(_ctx.stringValue("DescribeBatchResultDetailResponse.BatchResultDetails["+ i +"].Rr"));
			batchResultDetail.setValue(_ctx.stringValue("DescribeBatchResultDetailResponse.BatchResultDetails["+ i +"].Value"));
			batchResultDetail.setStatus(_ctx.booleanValue("DescribeBatchResultDetailResponse.BatchResultDetails["+ i +"].Status"));
			batchResultDetail.setReason(_ctx.stringValue("DescribeBatchResultDetailResponse.BatchResultDetails["+ i +"].Reason"));
			batchResultDetail.setNewRr(_ctx.stringValue("DescribeBatchResultDetailResponse.BatchResultDetails["+ i +"].NewRr"));
			batchResultDetail.setNewValue(_ctx.stringValue("DescribeBatchResultDetailResponse.BatchResultDetails["+ i +"].NewValue"));
			batchResultDetail.setBatchType(_ctx.stringValue("DescribeBatchResultDetailResponse.BatchResultDetails["+ i +"].BatchType"));
			batchResultDetail.setOperateDateStr(_ctx.stringValue("DescribeBatchResultDetailResponse.BatchResultDetails["+ i +"].OperateDateStr"));
			batchResultDetail.setLine(_ctx.stringValue("DescribeBatchResultDetailResponse.BatchResultDetails["+ i +"].Line"));
			batchResultDetail.setPriority(_ctx.stringValue("DescribeBatchResultDetailResponse.BatchResultDetails["+ i +"].Priority"));
			batchResultDetail.setTtl(_ctx.stringValue("DescribeBatchResultDetailResponse.BatchResultDetails["+ i +"].Ttl"));
			batchResultDetail.setRecordId(_ctx.stringValue("DescribeBatchResultDetailResponse.BatchResultDetails["+ i +"].RecordId"));
			batchResultDetail.setRemark(_ctx.stringValue("DescribeBatchResultDetailResponse.BatchResultDetails["+ i +"].Remark"));
			batchResultDetail.setRrStatus(_ctx.stringValue("DescribeBatchResultDetailResponse.BatchResultDetails["+ i +"].RrStatus"));

			batchResultDetails.add(batchResultDetail);
		}
		describeBatchResultDetailResponse.setBatchResultDetails(batchResultDetails);
	 
	 	return describeBatchResultDetailResponse;
	}
}