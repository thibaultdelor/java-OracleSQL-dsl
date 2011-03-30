package com.thibaultdelor.JSQL.join;

import com.thibaultdelor.JSQL.SQLOutputable;

public interface ExplicitJoin extends JoinClause,SQLOutputable {
	public static enum JoinType implements SQLOutputable{
		JOIN("JOIN"),
		INNER_JOIN("INNER JOIN"),
		LEFT_JOIN("LEFT JOIN"),
		LEFT_OUTER_JOIN("LEFT OUTER JOIN"),
		RIGHT_JOIN("RIGHT JOIN"),
		RIGHT_OUTER_JOIN("RIGHT OUTER JOIN");

		
		private final String representation;
		
		private JoinType(String representation) {
			this.representation = representation;
		}

		@Override
		public void output(StringBuilder sb, SQLContext context) {
			sb.append(representation);
			sb.append(" ");
		}
	}
}
