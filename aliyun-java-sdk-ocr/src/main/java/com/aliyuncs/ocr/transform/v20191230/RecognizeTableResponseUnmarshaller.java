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

package com.aliyuncs.ocr.transform.v20191230;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ocr.model.v20191230.RecognizeTableResponse;
import com.aliyuncs.ocr.model.v20191230.RecognizeTableResponse.Data;
import com.aliyuncs.ocr.model.v20191230.RecognizeTableResponse.Data.Table;
import com.aliyuncs.ocr.model.v20191230.RecognizeTableResponse.Data.Table.TableRow;
import com.aliyuncs.ocr.model.v20191230.RecognizeTableResponse.Data.Table.TableRow.TableColumn;
import com.aliyuncs.transform.UnmarshallerContext;


public class RecognizeTableResponseUnmarshaller {

	public static RecognizeTableResponse unmarshall(RecognizeTableResponse recognizeTableResponse, UnmarshallerContext _ctx) {
		
		recognizeTableResponse.setRequestId(_ctx.stringValue("RecognizeTableResponse.RequestId"));

		Data data = new Data();
		data.setFileContent(_ctx.stringValue("RecognizeTableResponse.Data.FileContent"));

		List<Table> tables = new ArrayList<Table>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeTableResponse.Data.Tables.Length"); i++) {
			Table table = new Table();

			List<String> head = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("RecognizeTableResponse.Data.Tables["+ i +"].Head.Length"); j++) {
				head.add(_ctx.stringValue("RecognizeTableResponse.Data.Tables["+ i +"].Head["+ j +"]"));
			}
			table.setHead(head);

			List<String> tail = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("RecognizeTableResponse.Data.Tables["+ i +"].Tail.Length"); j++) {
				tail.add(_ctx.stringValue("RecognizeTableResponse.Data.Tables["+ i +"].Tail["+ j +"]"));
			}
			table.setTail(tail);

			List<TableRow> tableRows = new ArrayList<TableRow>();
			for (int j = 0; j < _ctx.lengthValue("RecognizeTableResponse.Data.Tables["+ i +"].TableRows.Length"); j++) {
				TableRow tableRow = new TableRow();

				List<TableColumn> tableColumns = new ArrayList<TableColumn>();
				for (int k = 0; k < _ctx.lengthValue("RecognizeTableResponse.Data.Tables["+ i +"].TableRows["+ j +"].TableColumns.Length"); k++) {
					TableColumn tableColumn = new TableColumn();
					tableColumn.setStartColumn(_ctx.integerValue("RecognizeTableResponse.Data.Tables["+ i +"].TableRows["+ j +"].TableColumns["+ k +"].StartColumn"));
					tableColumn.setStartRow(_ctx.integerValue("RecognizeTableResponse.Data.Tables["+ i +"].TableRows["+ j +"].TableColumns["+ k +"].StartRow"));
					tableColumn.setEndColumn(_ctx.integerValue("RecognizeTableResponse.Data.Tables["+ i +"].TableRows["+ j +"].TableColumns["+ k +"].EndColumn"));
					tableColumn.setEndRow(_ctx.integerValue("RecognizeTableResponse.Data.Tables["+ i +"].TableRows["+ j +"].TableColumns["+ k +"].EndRow"));
					tableColumn.setHeight(_ctx.integerValue("RecognizeTableResponse.Data.Tables["+ i +"].TableRows["+ j +"].TableColumns["+ k +"].Height"));
					tableColumn.setWidth(_ctx.integerValue("RecognizeTableResponse.Data.Tables["+ i +"].TableRows["+ j +"].TableColumns["+ k +"].Width"));

					List<String> texts = new ArrayList<String>();
					for (int l = 0; l < _ctx.lengthValue("RecognizeTableResponse.Data.Tables["+ i +"].TableRows["+ j +"].TableColumns["+ k +"].Texts.Length"); l++) {
						texts.add(_ctx.stringValue("RecognizeTableResponse.Data.Tables["+ i +"].TableRows["+ j +"].TableColumns["+ k +"].Texts["+ l +"]"));
					}
					tableColumn.setTexts(texts);

					tableColumns.add(tableColumn);
				}
				tableRow.setTableColumns(tableColumns);

				tableRows.add(tableRow);
			}
			table.setTableRows(tableRows);

			tables.add(table);
		}
		data.setTables(tables);
		recognizeTableResponse.setData(data);
	 
	 	return recognizeTableResponse;
	}
}