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

package com.aliyuncs.digitalstore.transform.v20200107;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.digitalstore.model.v20200107.ListBarcodesResponse;
import com.aliyuncs.digitalstore.model.v20200107.ListBarcodesResponse.BarcodeModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListBarcodesResponseUnmarshaller {

	public static ListBarcodesResponse unmarshall(ListBarcodesResponse listBarcodesResponse, UnmarshallerContext _ctx) {
		
		listBarcodesResponse.setRequestId(_ctx.stringValue("ListBarcodesResponse.RequestId"));
		listBarcodesResponse.setPageSize(_ctx.integerValue("ListBarcodesResponse.PageSize"));
		listBarcodesResponse.setPageNumber(_ctx.integerValue("ListBarcodesResponse.PageNumber"));
		listBarcodesResponse.setSuccess(_ctx.booleanValue("ListBarcodesResponse.Success"));
		listBarcodesResponse.setTotalCount(_ctx.integerValue("ListBarcodesResponse.TotalCount"));

		List<BarcodeModel> barcodes = new ArrayList<BarcodeModel>();
		for (int i = 0; i < _ctx.lengthValue("ListBarcodesResponse.Barcodes.Length"); i++) {
			BarcodeModel barcodeModel = new BarcodeModel();
			barcodeModel.setDisable(_ctx.integerValue("ListBarcodesResponse.Barcodes["+ i +"].Disable"));
			barcodeModel.setStyleId(_ctx.stringValue("ListBarcodesResponse.Barcodes["+ i +"].StyleId"));
			barcodeModel.setSizeName(_ctx.stringValue("ListBarcodesResponse.Barcodes["+ i +"].SizeName"));
			barcodeModel.setRetailPrice(_ctx.floatValue("ListBarcodesResponse.Barcodes["+ i +"].RetailPrice"));
			barcodeModel.setSizeCode(_ctx.stringValue("ListBarcodesResponse.Barcodes["+ i +"].SizeCode"));
			barcodeModel.setColorCode(_ctx.stringValue("ListBarcodesResponse.Barcodes["+ i +"].ColorCode"));
			barcodeModel.setName(_ctx.stringValue("ListBarcodesResponse.Barcodes["+ i +"].Name"));
			barcodeModel.setColorId(_ctx.stringValue("ListBarcodesResponse.Barcodes["+ i +"].ColorId"));
			barcodeModel.setCode(_ctx.stringValue("ListBarcodesResponse.Barcodes["+ i +"].Code"));
			barcodeModel.setUpdateDate(_ctx.stringValue("ListBarcodesResponse.Barcodes["+ i +"].UpdateDate"));
			barcodeModel.setSizeId(_ctx.stringValue("ListBarcodesResponse.Barcodes["+ i +"].SizeId"));
			barcodeModel.setColorName(_ctx.stringValue("ListBarcodesResponse.Barcodes["+ i +"].ColorName"));
			barcodeModel.setCreateDate(_ctx.stringValue("ListBarcodesResponse.Barcodes["+ i +"].CreateDate"));
			barcodeModel.setStyleCode(_ctx.stringValue("ListBarcodesResponse.Barcodes["+ i +"].StyleCode"));
			barcodeModel.setStyleName(_ctx.stringValue("ListBarcodesResponse.Barcodes["+ i +"].StyleName"));
			barcodeModel.setDescription(_ctx.stringValue("ListBarcodesResponse.Barcodes["+ i +"].Description"));
			barcodeModel.setCurrentPrice(_ctx.floatValue("ListBarcodesResponse.Barcodes["+ i +"].CurrentPrice"));
			barcodeModel.setBarcodeId(_ctx.stringValue("ListBarcodesResponse.Barcodes["+ i +"].BarcodeId"));

			barcodes.add(barcodeModel);
		}
		listBarcodesResponse.setBarcodes(barcodes);
	 
	 	return listBarcodesResponse;
	}
}